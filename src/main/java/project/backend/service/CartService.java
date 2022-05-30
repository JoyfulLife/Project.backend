package project.backend.service;

import project.backend.vo.AdvertisingVO;
import project.backend.vo.CartVO;



import java.util.List;

public interface CartService {

    public void insertCart(AdvertisingVO advertisingVO);

    public List<CartVO> getCartList(CartVO cartVO);
}
