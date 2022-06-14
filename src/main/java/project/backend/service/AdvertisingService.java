package project.backend.service;

import project.backend.vo.AdvertisingVO;
import project.backend.vo.CountAdvertisingVO;
import project.backend.vo.TableVO;

import java.util.List;

public interface AdvertisingService {
    public List<AdvertisingVO> selectAdvertisingList(AdvertisingVO advertisingVO);

    public AdvertisingServiceImpl.MyAdrequestListAndCount selectMyAdRequestList(AdvertisingVO advertisingVO);

    public CountAdvertisingVO countAdvertisingList(CountAdvertisingVO countAdvertisingVO);

    public AdvertisingVO insertAdvertising(AdvertisingVO advertisingVO);

    public AdvertisingVO deleteMyAdRequestList(List<AdvertisingVO> advertisingVO);
}
