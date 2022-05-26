package project.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import project.backend.service.CartService;
import project.backend.vo.AdvertisingVO;
import project.backend.vo.TableVO;

import java.util.List;
import java.util.Locale;

@Controller
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping(value = "/cart", method = RequestMethod.POST)
    @ResponseBody
    public void insertCart(Locale locale, @RequestBody AdvertisingVO advertisingVO) {

        cartService.insertCart(advertisingVO);

    }

    @RequestMapping(value = "/cartList", method = RequestMethod.GET)
    @ResponseBody
    public List<AdvertisingVO> getCartList11(){
        List<AdvertisingVO> advertisingVO = cartService.getCartList();

        return advertisingVO;
    }
}
