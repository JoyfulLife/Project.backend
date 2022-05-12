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
        return clientMapper.selectValidClient(clientVO);
    }


    //TODO 2022-05-12 insertClient, DeduplicationUser_ID 합치기!!!
    @Override
    public void insertClient(SignUpVO signUpVO) {
        clientMapper.insertClient(signUpVO);
    }
    @Override
    public int DeduplicationUser_ID(SignUpVO signUpVO) {
        //회원가입시 이미 등록된 User_ID가 있는지 확인!

            int DeduplicationUser_ID = clientMapper.DeduplicationUser_ID(signUpVO);

            if (DeduplicationUser_ID >= 1) {
                signUpVO.setMessage("잘못된 정보입니다.");
            }

        return clientMapper.DeduplicationUser_ID(signUpVO);
    }

}
