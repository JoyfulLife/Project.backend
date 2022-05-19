package project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.backend.dao.AdvertisingMapper;
import project.backend.vo.AdvertisingVO;
import project.backend.vo.ClientVO;
import project.backend.vo.CountAdvertisingVO;
import project.backend.vo.ResponseVO;

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
        countAdvertisingVO.setCategory("Sports");
        int sportsCount = advertisingMapper.categoryCount(countAdvertisingVO);
        countAdvertisingVO.setCategory("News");
        int newsCount = advertisingMapper.categoryCount(countAdvertisingVO);
        countAdvertisingVO.setCategory("Web toon");
        int webtoonCount = advertisingMapper.categoryCount(advertisingVO);

        advertisingVO.setSports_count(sportsCount);
        advertisingVO.setNews_count(newsCount);
        advertisingVO.setWebtoon_count(webtoonCount);

        return advertisingVO;
    }
}
