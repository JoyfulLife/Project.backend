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
    public List<AdvertisingVO> selectAdvertisingList(AdvertisingVO advertisingVO) {

        List<AdvertisingVO> res = advertisingMapper.selectAdvertisingList(advertisingVO);


        return res;
    }

    @Override
    public CountAdvertisingVO countAdvertisingList(CountAdvertisingVO countAdvertisingVO) {

        CountAdvertisingVO advertisingVO = new CountAdvertisingVO();

        //  카테고리별 count 개수를 select 한다!
        countAdvertisingVO.setCategory("All");
        int allCount = advertisingMapper.categoryCount(countAdvertisingVO);
        countAdvertisingVO.setCategory("Sports");
        int sportsCount = advertisingMapper.categoryCount(countAdvertisingVO);
        countAdvertisingVO.setCategory("News");
        int newsCount = advertisingMapper.categoryCount(countAdvertisingVO);
        countAdvertisingVO.setCategory("Web toon");
        int webtoonCount = advertisingMapper.categoryCount(countAdvertisingVO);

        advertisingVO.setAll_count(allCount);
        advertisingVO.setSports_count(sportsCount);
        advertisingVO.setNews_count(newsCount);
        advertisingVO.setWebtoon_count(webtoonCount);

        return advertisingVO;
    }

    @Override
    public AdvertisingVO insertAdvertising(AdvertisingVO advertisingVO) {
        try{

            advertisingMapper.insertAdvertising(advertisingVO);
            advertisingVO.setMessage(" 성공! ");
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
