package project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.backend.dao.CartMapper;
import project.backend.vo.AdvertisingVO;
import project.backend.vo.CartVO;


import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private final CartMapper cartMapper;

    @Autowired
    public CartServiceImpl(CartMapper cartMapper) {
        this.cartMapper = cartMapper;
    }

    @Override
    public void insertCart(AdvertisingVO advertisingVO) {

        cartMapper.insertCart(advertisingVO);

    }

    @Override
    public List<AdvertisingVO> getCartList(CartVO cartVO) {

        List<AdvertisingVO> res = cartMapper.getCartList(cartVO);

//        int cartCount = cartMapper.cart_Count(cartVO);

        return res;
    }

}
