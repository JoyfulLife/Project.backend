package project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    @Transactional
    @Override
    public void insertCart(AdvertisingVO advertisingVO) {

        cartMapper.insertCart(advertisingVO);

    }

    @Override
    public List<CartVO> getCartList(CartVO cartVO) {

        List<CartVO> res = cartMapper.getCartList(cartVO);

        //TODO cart_count !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        int cartCount = cartMapper.cart_Count(cartVO);

        return res;
    }


}
