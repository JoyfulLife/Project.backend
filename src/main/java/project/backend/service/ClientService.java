package project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.backend.dao.ClientDAO;
import project.backend.vo.ClientVO;
import project.backend.vo.ResponseVO;

import java.util.List;

//@Service
public interface ClientService {
    public List<ClientVO> getAllDataList();


//    private ClientDAO ClientDao;
//
////    @Autowired
////    public ClientService(ClientDAO clientDao) {
////        this.ClientDao = clientDao;
////    }
//
////    @Autowired
////    public ClientService(SqlSession sqlSession) {
////        this.ClientDao = sqlSession.getMapper(ClientDAO.class);
////    }
//
//
////    @Transactional(transactionManager = "txMgr", readOnly = true)
//    public ResponseVO selectClient(ClientVO ClientVO) {
//        ResponseVO responseVO = new ResponseVO();
//
//        ClientVO client = ClientDao.selectClient(ClientVO);
//
//        responseVO.appendDataMap("client", client);
//
//        return responseVO;
//    }
}
