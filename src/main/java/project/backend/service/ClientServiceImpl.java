package project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.backend.dao.ClientMapper;
import project.backend.vo.ClientVO;
import project.backend.vo.ResponseVO;
import project.backend.vo.SignUpVO;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    private final ClientMapper clientMapper;

    @Autowired
    public ClientServiceImpl(ClientMapper clientMapper){
        this.clientMapper = clientMapper;
    }

//    @Override
//    public List<ClientVO> getAllDataList() {
//        return clientMapper.getAllDataList();
//    }
    @Override
    public ClientVO selectValidClient(ClientVO clientVO) {
        return clientMapper.selectValidClient(clientVO);
    }
    @Override
//    @Transactional(transactionManager = "txMgr", readOnly = true)
    public void insertClient(SignUpVO signUpVO) {
        clientMapper.insertClient(signUpVO);
    }
    @Override
    public int DeduplicationUser_ID(SignUpVO signUpVO) {
        //회원가입시 이미 등록된 User_ID가 있는지 확인!

            int DeduplicationUser_ID = clientMapper.DeduplicationUser_ID(signUpVO);

            if (DeduplicationUser_ID == 1) {
                clientMapper.DeduplicationUser_ID(signUpVO);
            }

        return clientMapper.DeduplicationUser_ID(signUpVO);
    }

}
