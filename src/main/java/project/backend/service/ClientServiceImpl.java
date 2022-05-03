package project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.backend.dao.ClientMapper;
import project.backend.vo.ClientVO;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    private final ClientMapper clientMapper;

    @Autowired
    public ClientServiceImpl(ClientMapper clientMapper){
        this.clientMapper = clientMapper;
    }

    @Override
    public List<ClientVO> getAllDataList() {
        return clientMapper.getAllDataList();
    }
}
