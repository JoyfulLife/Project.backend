package project.backend.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import project.backend.vo.AdvertisingVO;
import project.backend.vo.ClientVO;
import project.backend.vo.CountAdvertisingVO;

import java.util.List;

@Repository
@Mapper
public interface AdvertisingMapper {

    List<AdvertisingVO> selectAdvertisingList(AdvertisingVO advertisingVO);

    List<AdvertisingVO> seledctAdminList(AdvertisingVO advertisingVO);

    int categoryCount(CountAdvertisingVO countAdvertisingVO);

    void insertAdvertising(AdvertisingVO advertisingVO);

    List<AdvertisingVO> selectMyAdRequestList(AdvertisingVO advertisingVO);

    int myAdRequest_Count(AdvertisingVO advertisingVO);

    public void deleteMyAdRequestList(List<AdvertisingVO> advertisingVO);

    int deleteMyAdRequestListCount(List<AdvertisingVO> advertisingVO);

    void updateAdvertisingList(AdvertisingVO advertisingVO);

    void denyAdvertisingList(AdvertisingVO advertisingVO);

    int AdCount(AdvertisingVO advertisingVO);

}
