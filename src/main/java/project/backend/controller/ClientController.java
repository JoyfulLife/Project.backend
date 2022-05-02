package project.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import project.backend.service.ClientService;
import project.backend.vo.ClientVO;
import project.backend.vo.ResponseVO;

import java.util.Locale;

@Controller
public class ClientController{

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @RequestMapping(value = "/ado/client/clientInfo", method = RequestMethod.GET)
    @ResponseBody
    public ResponseVO getclient(Locale locale, @ModelAttribute ClientVO ClientVO) {

        ResponseVO responseVO = new ResponseVO();
//        ClientVO clientVO = new ClientVO();

        responseVO = clientService.selectClient(ClientVO);

        return responseVO;
    }

    @RequestMapping(value = "/ado/client/saveClient", method = RequestMethod.POST)
    @ResponseBody
    public ClientVO saveclient(Locale locale, @RequestBody ClientVO clientVO) {

        ClientVO ClientVO = new ClientVO();

        return ClientVO;
    }
}
