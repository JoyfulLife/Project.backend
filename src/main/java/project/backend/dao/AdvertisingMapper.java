package project.backend.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import project.backend.vo.AdvertisingVO;
import project.backend.vo.ClientVO;

import java.util.List;

@Repository
@Mapper
public interface AdvertisingMapper {
    List<AdvertisingVO> selectAdvertisingList(AdvertisingVO advertisingVO);
}
