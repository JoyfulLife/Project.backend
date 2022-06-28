package project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.backend.dao.AdvertisingMapper;
import project.backend.util.ExceptionUtils;
import project.backend.vo.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdvertisingServiceImpl implements AdvertisingService{
    private final AdvertisingMapper advertisingMapper;

    @Autowired
    public AdvertisingServiceImpl(AdvertisingMapper advertisingMapper) {
        this.advertisingMapper = advertisingMapper;
    }

    @Override
    public selectAdvertisingListAndCount selectAdvertisingList(AdvertisingVO advertisingVO) {


        List<AdvertisingVO> res = new ArrayList<>();
        try {
            if (advertisingVO.getAdminCheck().isEmpty()) {
                // 일단 유저들이 list를 받을 때
                //광고의 해당 Ad_no만 for문을 돌도록 => RATE를 항상 최신화 하기 위한 코드.
                List<AdvertisingVO> resAd_no = advertisingMapper.getAd_no(advertisingVO);

                for(AdvertisingVO tmp : resAd_no){
                    //형변환
                    int tmp_idex = Integer.parseInt(tmp.getAd_no());
                    //RATE 업데이트를 한다.
                    advertisingVO.setNum(tmp_idex);
                    advertisingMapper.rateUpdateAdvertisingList(advertisingVO);
                }

                res = advertisingMapper.selectAdvertisingList(advertisingVO);
            } else {
                // admin이 승인을 눌렀을때 승인처리를 하기 위함
                if(advertisingVO.getUpdateData() != null){
                    advertisingMapper.updateAdvertisingList(advertisingVO);

                    // 승인거절!!
                }else if (advertisingVO.getDeleteData() != null){
                    advertisingMapper.denyAdvertisingList(advertisingVO);
                }

                // admin이 AD list를 받을때 (승인을 결정을 위해 받아오는 list)
                res = advertisingMapper.seledctAdminList(advertisingVO);

            }
            int AdListCount = advertisingMapper.AdCount(advertisingVO);
            return new selectAdvertisingListAndCount(res , AdListCount);
        }catch (Exception e){
            // 에러 발생시  message 넘겨주는 거 개발 완료 하도록........
            new ExceptionUtils(advertisingVO);
            int AdListCount = 0;
            return new selectAdvertisingListAndCount(res , AdListCount);
        }

    }

    //selectAdvertisingListAndCount 에서 list와 count 둘다 동시에 받아오기 위해서 만든 class
    public class selectAdvertisingListAndCount {

//        public selectAdvertisingListAndCount() {}

        public List<AdvertisingVO> res;
        public int AdListCount;

        public selectAdvertisingListAndCount(List<AdvertisingVO> res, int AdListCount) {
            this.res = res;
            this.AdListCount = AdListCount;
        }

    }

    @Override
    public CountAdvertisingVO countAdvertisingList(CountAdvertisingVO countAdvertisingVO) {

        try {
            //  카테고리별 count 개수를 select 한다!
            countAdvertisingVO.setCategory("All");
            int allCount = advertisingMapper.categoryCount(countAdvertisingVO);
            countAdvertisingVO.setCategory("Sports");
            int sportsCount = advertisingMapper.categoryCount(countAdvertisingVO);
            countAdvertisingVO.setCategory("Shopping");
            int shopingCount = advertisingMapper.categoryCount(countAdvertisingVO);
            countAdvertisingVO.setCategory("Book");
            int bookCount = advertisingMapper.categoryCount(countAdvertisingVO);

            countAdvertisingVO.setAll_count(allCount);
            countAdvertisingVO.setSports_count(sportsCount);
            countAdvertisingVO.setShopping_count(shopingCount);
            countAdvertisingVO.setBook_count(bookCount);

            return countAdvertisingVO;
        }catch (Exception e){
            new ExceptionUtils(countAdvertisingVO);
            return countAdvertisingVO;
        }
    }

    @Override
    public AdvertisingVO insertAdvertising(AdvertisingVO advertisingVO) {
        try{

            advertisingMapper.insertAdvertising(advertisingVO);
            advertisingVO.setMessage(" 광고 신청에 성공했습니다.! 관리자가 승인하기 전까지 기다려 주세요~");
        }catch (Exception e) {
            new ExceptionUtils(advertisingVO);

            return advertisingVO;
        }

        return advertisingVO;
    }

    @Override
    public MyAdrequestListAndCount selectMyAdRequestList(AdvertisingVO advertisingVO) {

        List<AdvertisingVO> res = advertisingMapper.selectMyAdRequestList(advertisingVO);

        int myAdCount = advertisingMapper.myAdRequest_Count(advertisingVO);

        return new MyAdrequestListAndCount(res , myAdCount);
    }
    //selectMyAdRequestList 에서 list와 count 둘다 동시에 받아오기 위해서 만든 class
    public class MyAdrequestListAndCount {

        public List<AdvertisingVO> res;
        public int myAdCount;

        public MyAdrequestListAndCount(List<AdvertisingVO> res, int myAdCount) {
            this.res = res;
            this.myAdCount = myAdCount;
        }

    }

    @Override
    public AdvertisingVO deleteMyAdRequestList(List<AdvertisingVO> advertisingVO) {

        AdvertisingVO res = new AdvertisingVO();

        try {
            // 삭제한 갯수 넘겨주기 방법 2개  int deleteCount = advertisingVO.size();
            int deleteCount = advertisingMapper.deleteMyAdRequestListCount(advertisingVO);

            advertisingMapper.deleteMyAdRequestList(advertisingVO);
            res.setMessage( deleteCount +"개 삭제 성공!! ");

        }catch (Exception e){
            new ExceptionUtils(res);
            return res;
        }

        return res;
    }


}
