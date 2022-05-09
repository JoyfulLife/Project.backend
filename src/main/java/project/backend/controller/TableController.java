package project.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import project.backend.service.TableService;
import project.backend.vo.TableVO;

import java.util.List;

@Controller
public class TableController {
    private final TableService tableService;

    @Autowired
    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @RequestMapping(value = "/table", method = RequestMethod.GET)
    @ResponseBody
    public List<TableVO> getTable(){
        List<TableVO> tableVO = tableService.getTableList();

        return tableVO;
    }
}
