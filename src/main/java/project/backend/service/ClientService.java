package project.backend.service;

import project.backend.vo.ClientVO;
import project.backend.vo.SignUpVO;

public interface ClientService {

    public ClientVO selectValidClient(ClientVO clientVO);

    public SignUpVO DeduplicationUser_ID(SignUpVO signUpVO);

}
