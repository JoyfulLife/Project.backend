package project.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import project.backend.service.ClientService;
import project.backend.util.ExceptionUtils;
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

    @RequestMapping(value = "/ado/client/clientInfo", method = RequestMethod.POST)
    @ResponseBody
    public ClientVO validclient(Locale locale, @RequestBody ClientVO ClientVO) throws ExceptionUtils {

        //로그인할때 등록된 인원인지 확인
        ClientVO clientVO = clientService.selectValidClient(ClientVO);

        return clientVO;
    }

    @RequestMapping(value = "/ado/client/saveClient", method = RequestMethod.POST)
    @ResponseBody
    public SignUpVO saveclient(Locale locale, @RequestBody SignUpVO signUpVO) throws ExceptionUtils {

        //회원가입시 이미 등록된 User_ID가 있는지 확인!
        clientService.DeduplicationUser_ID(signUpVO);

        //clientService.insertClient(signUpVO);

        return signUpVO;

    }
}





//    //get 으로 받을거면 @ModelAttribute
//    @RequestMapping(value = "/ado/client/clientInfo", method = RequestMethod.GET)
//    @ResponseBody
//    public List<ClientVO> getclient(Locale locale, @ModelAttribute ClientVO ClientVO) {
//
//        List<ClientVO> clientVO = clientService.getAllDataList();
//
//        return clientVO;
//    }
//master branch push test 001 집 노트북 push 확인!!!!!
