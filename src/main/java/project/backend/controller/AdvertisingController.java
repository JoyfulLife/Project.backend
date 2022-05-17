package project.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import project.backend.service.AdvertisingService;
import project.backend.vo.AdvertisingVO;

import java.util.List;
import java.util.Locale;

@Controller
public class AdvertisingController {
    private final AdvertisingService advertisingService;

    @Autowired
    public AdvertisingController(AdvertisingService advertisingService) {
        this.advertisingService = advertisingService;
    }

    @RequestMapping(value = "/advertising/advertisingList", method = RequestMethod.POST)
    @ResponseBody
    public List<AdvertisingVO> getAdvertisingList(Locale locale, @RequestBody AdvertisingVO advertisingVO) {


        List<AdvertisingVO> advertisingVO1 = advertisingService.selectAdvertisingList(advertisingVO);

        return advertisingVO1;
    }

}
