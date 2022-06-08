package project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.backend.dao.CartMapper;
import project.backend.util.ExceptionUtils;
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

    @Override
    public CartVO deleteCartList(List<AdvertisingVO> advertisingVO) {

        CartVO cartVO = new CartVO();

        try {
            // 삭제한 갯수 넘겨주기 방법 2개  int deleteCount = advertisingVO.size();
            int deleteCount = cartMapper.deleteCartListCount(advertisingVO);

            cartMapper.deleteCartList(advertisingVO);
            cartVO.setSuccessMessage( deleteCount +"개 삭제 성공!! ");

        }catch (Exception e){
            new ExceptionUtils(cartVO);
            return cartVO;
        }

        return cartVO;
    }

}
