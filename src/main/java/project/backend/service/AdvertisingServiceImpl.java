package project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.backend.dao.AdvertisingMapper;
import project.backend.vo.AdvertisingVO;
import project.backend.vo.ClientVO;

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
        return advertisingMapper.selectAdvertisingList(advertisingVO);
    }
}
