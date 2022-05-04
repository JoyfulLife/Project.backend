package project.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.backend.dao.TableMapper;
import project.backend.vo.TableVO;

import java.util.List;

@Service
public class TableServiceImpl implements TableService {
    private final TableMapper tableMapper;

    @Autowired
    public TableServiceImpl(TableMapper tableMapper) {
        this.tableMapper = tableMapper;
    }

    @Override
    public List<TableVO> getTableList() {
        return tableMapper.getTableList();
    }
}
