package project.backend.service;

import project.backend.vo.AdvertisingVO;
import project.backend.vo.TableVO;

import java.util.List;

public interface AdvertisingService {
    public List<AdvertisingVO> selectAdvertisingList(AdvertisingVO advertisingVO);
}
