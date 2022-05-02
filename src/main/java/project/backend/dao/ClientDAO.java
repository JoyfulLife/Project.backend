package project.backend.dao;

import org.springframework.stereotype.Repository;
import project.backend.vo.ClientVO;

@Repository
public interface ClientDAO {
//    ClientVO selectClient(ClientVO ClientVO);
    ClientVO selectClient(ClientVO ClientVO);
}
