package project.backend.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import project.backend.vo.*;


import java.util.List;

@Repository
@Mapper
public interface CartMapper {
    public void insertCart(AdvertisingVO advertisingVO);

    List<AdvertisingVO> getCartList(CartVO cartVO);

    int cart_Count(CountAdvertisingVO countAdvertisingVO);
}
