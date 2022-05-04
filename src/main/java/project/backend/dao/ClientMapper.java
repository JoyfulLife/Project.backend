package project.backend.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import project.backend.vo.ClientVO;
import project.backend.vo.SignUpVO;

import java.util.List;

@Repository
@Mapper
public interface ClientMapper {
    List<ClientVO> getAllDataList();

    void insertClient(SignUpVO signUpVO);
}
