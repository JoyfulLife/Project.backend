package project.backend.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import project.backend.vo.AdvertisingVO;
import project.backend.vo.TableVO;


import java.util.List;

@Repository
@Mapper
public interface CartMapper {
    public void insertCart(AdvertisingVO advertisingVO);

    List<AdvertisingVO> getCartList();
}
