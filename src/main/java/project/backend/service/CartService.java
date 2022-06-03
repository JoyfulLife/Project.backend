package project.backend.service;

import project.backend.vo.AdvertisingVO;
import project.backend.vo.CartVO;

public interface CartService {

    public void insertCart(AdvertisingVO advertisingVO);

    public CartServiceImpl.cartListAndCount getCartList(CartVO cartVO);
}
