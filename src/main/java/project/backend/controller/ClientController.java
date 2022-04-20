package project.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import project.backend.vo.ClientVo;

import java.util.Locale;

@Controller
public class ClientController {
    @RequestMapping(value = "/ado/client/clientInfo", method = RequestMethod.GET)
    @ResponseBody
    public ClientVo getclient(Locale locale, @ModelAttribute ClientVo ClientVO) {
//        ResponseVO responseVO = new ResponseVO();
        ClientVo ClientVo = new ClientVo();
// push 확인 personal laptop
        return ClientVo;
    }

    @RequestMapping(value = "/ado/client/saveClient", method = RequestMethod.POST)
    @ResponseBody
    public ClientVo saveclient(Locale locale, @RequestBody ClientVo ClientVO) {

        ClientVo ClientVo = new ClientVo();

        return ClientVo;
    }
}
