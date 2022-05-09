package project.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import project.backend.service.ClientService;
import project.backend.vo.ClientVO;
import project.backend.vo.ResponseVO;
import project.backend.vo.SignUpVO;

import java.util.List;
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
    public List<ClientVO> getclient(Locale locale, @ModelAttribute ClientVO ClientVO) {

        List<ClientVO> clientVO = clientService.getAllDataList();

        return clientVO;
    }


    @RequestMapping(value = "/ado/client/saveClient", method = RequestMethod.POST)
    @ResponseBody
    public void saveclient(Locale locale, @RequestBody SignUpVO signUpVO) {

        clientService.insertClient(signUpVO);

    }

}
//github test
