package project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import project.backend.dao.ClientMapper;
import project.backend.vo.ClientVO;
import project.backend.vo.ResponseVO;
import project.backend.vo.SignUpVO;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientMapper clientMapper;

    @Autowired
    public ClientServiceImpl(ClientMapper clientMapper){
        this.clientMapper = clientMapper;
    }


    @Override
    public ClientVO selectValidClient(ClientVO clientVO) {

        ClientVO res = clientMapper.selectValidClient(clientVO);

        // 로그인에 성공하면 로그인 상태를 Yes로 한다.
        if(res == null){
            System.out.println("null~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//            res.setLoginStatus("No");
        }else {
            res.setLoginStatus("Yes");
        }

        return res;
    }



//    @Override
//    public void insertClient(SignUpVO signUpVO) {
//        clientMapper.insertClient(signUpVO);
//    }
    @Override
    public int DeduplicationUser_ID(SignUpVO signUpVO) {

        //회원가입시 이미 등록된 User_ID가 있는지 확인!

        int DeduplicationUser_ID = clientMapper.DeduplicationUser_ID(signUpVO);

        if (DeduplicationUser_ID >= 1) {
            signUpVO.setFailMessage("중복된 User_ID입니다.");
        }else {
            signUpVO.setSuccessMessage("회원가입 성공!");
            clientMapper.insertClient(signUpVO);
        }

        return clientMapper.DeduplicationUser_ID(signUpVO);
    }

}
