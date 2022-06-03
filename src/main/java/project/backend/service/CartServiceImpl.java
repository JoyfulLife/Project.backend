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
    public cartListAndCount getCartList(CartVO cartVO) {

        List<CartVO> res = cartMapper.getCartList(cartVO);

        int cartCount = cartMapper.cart_Count(cartVO);

        return new cartListAndCount(res, cartCount);
    }

    //getCartList 에서 list와 count 둘다 동시에 받아오기 위해서 만든 class
    public class cartListAndCount {

        public List<CartVO> res;
        public int cartCount;

        public cartListAndCount(List<CartVO> res, int cartCount) {
            this.res = res;
            this.cartCount = cartCount;
        }

    }

}
