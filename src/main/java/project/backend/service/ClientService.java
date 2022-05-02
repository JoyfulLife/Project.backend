package project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.backend.dao.ClientDAO;
import project.backend.vo.ClientVO;
import project.backend.vo.ResponseVO;

@Service
public class ClientService {

    private final ClientDAO ClientDao;

    @Autowired
    public ClientService(ClientDAO clientDao) {
        ClientDao = clientDao;
    }


//    @Transactional(transactionManager = "txMgr", readOnly = true)
    public ResponseVO selectClient(ClientVO ClientVO) {
        ResponseVO responseVO = new ResponseVO();

        ClientVO client = ClientDao.selectClient(ClientVO);

        responseVO.appendDataMap("client", client);

        return responseVO;
    }
}
