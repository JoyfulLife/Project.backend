package project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.backend.dao.ClientDAO;
import project.backend.util.ExceptionUtils;
import project.backend.vo.ClientVO;
import project.backend.vo.ResponseVO;
import project.backend.vo.SignUpVO;

import java.util.List;

public interface ClientService {
//    public List<ClientVO> getAllDataList();

    public ClientVO selectValidClient(ClientVO clientVO);

//    public void insertClient(SignUpVO signUpVO);

    public SignUpVO DeduplicationUser_ID(SignUpVO signUpVO);

}
