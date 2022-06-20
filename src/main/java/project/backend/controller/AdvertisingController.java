package project.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import project.backend.service.AdvertisingService;
import project.backend.service.AdvertisingServiceImpl;
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
    public AdvertisingServiceImpl.selectAdvertisingListAndCount getAdvertisingList(Locale locale, @RequestBody AdvertisingVO advertisingVO) {

        AdvertisingServiceImpl.selectAdvertisingListAndCount res = advertisingService.selectAdvertisingList(advertisingVO);

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
    public AdvertisingVO insertAdvertising(Locale locale, @RequestBody AdvertisingVO advertisingVO) {

        advertisingService.insertAdvertising(advertisingVO);

        return advertisingVO;
    }

    @RequestMapping(value = "/advertising/myAdRequest", method = RequestMethod.POST)
    @ResponseBody
    public AdvertisingServiceImpl.MyAdrequestListAndCount getMyAdRequestList(Locale locale, @RequestBody AdvertisingVO advertisingVO) {

        AdvertisingServiceImpl.MyAdrequestListAndCount res = advertisingService.selectMyAdRequestList(advertisingVO);

        return res;
    }

    @RequestMapping(value = "/advertising/deleteMyAdRequest", method = RequestMethod.POST)
    @ResponseBody
    public AdvertisingVO deleteMyAdRequestList(Locale locale, @RequestBody List<AdvertisingVO> advertisingVO){

        AdvertisingVO res = new AdvertisingVO();

        res = advertisingService.deleteMyAdRequestList(advertisingVO);

        return res;
    }
}
