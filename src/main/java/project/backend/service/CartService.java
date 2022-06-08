package project.backend.service;

import project.backend.vo.AdvertisingVO;
import project.backend.vo.CartVO;

import java.util.List;

public interface CartService {

    public void insertCart(AdvertisingVO advertisingVO);

    public CartServiceImpl.cartListAndCount getCartList(CartVO cartVO);

    public CartVO deleteCartList(List<AdvertisingVO> advertisingVO);
}
