package project.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import project.backend.service.AdvertisingService;
import project.backend.vo.AdvertisingVO;
import project.backend.vo.CountAdvertisingVO;

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

        List<AdvertisingVO> res = advertisingService.selectAdvertisingList(advertisingVO);

        return res;
    }

    @RequestMapping(value = "/advertising/countAdvertisingList", method = RequestMethod.GET)
    @ResponseBody
    public CountAdvertisingVO countAdvertisingList(Locale locale, @ModelAttribute CountAdvertisingVO countAdvertisingVO) {

        CountAdvertisingVO res = advertisingService.countAdvertisingList(countAdvertisingVO);

        return res;
    }

    @RequestMapping(value = "/advertising/insertAdvertising", method = RequestMethod.POST)
    @ResponseBody
    public void insertAdvertising(Locale locale, @RequestBody AdvertisingVO advertisingVO) {

        advertisingService.insertAdvertising(advertisingVO);

    }

}
