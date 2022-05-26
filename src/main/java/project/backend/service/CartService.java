package project.backend.service;

import project.backend.vo.AdvertisingVO;
import project.backend.vo.ClientVO;
import project.backend.vo.TableVO;


import java.util.List;

public interface CartService {

    public void insertCart(AdvertisingVO advertisingVO);

    public List<AdvertisingVO> getCartList(ClientVO clientVO);
}
