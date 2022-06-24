package project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.backend.dao.ClientMapper;
import project.backend.util.ExceptionUtils;
import project.backend.vo.ClientVO;
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

        try {
            if(clientVO.getUpdate().equals("update")){
                clientMapper.updateClient(clientVO);
            }else if(clientVO.getDelete().equals("delete")){
                clientMapper.deleteClient(clientVO);
                clientVO.setDelete("YES");
            }
            ClientVO res = clientMapper.selectValidClient(clientVO);

            // 로그인에 성공하면 로그인 상태를 Yes로 한다.
            if (res != null) {
                res.setLoginStatus("Yes");
            } else if(res == null) {
                res.setLoginStatus("No");
            }

            return res;
        }catch (Exception e){
            //널포인트, 쿼리 문제 등등
            new ExceptionUtils(clientVO);
            return clientVO;
        }
    }

    @Override
    public SignUpVO DeduplicationUser_ID(SignUpVO signUpVO){

        //회원가입시 이미 등록된 User_ID가 있는지 확인!
        try {

            int DeduplicationUser_ID = clientMapper.DeduplicationUser_ID(signUpVO);

            if (DeduplicationUser_ID >= 1) {
                signUpVO.setFailMessage("중복된 User_ID입니다.");
            } else {
                signUpVO.setSuccessMessage("회원가입 성공! 로그인 해주세요~");
                clientMapper.insertClient(signUpVO);
            }
            return signUpVO;

        }catch (Exception e){
            new ExceptionUtils(signUpVO);
            return signUpVO;
        }

    }

}
