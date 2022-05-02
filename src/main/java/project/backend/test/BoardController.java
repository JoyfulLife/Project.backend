package project.backend.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

//    @RequestMapping("/ado/client/clientInfo")    // 이 주소로 접속하면 이 메소드를 호출한다.(매핑한다.)
//    public ModelAndView openBoardList() throws Exception {
//        ModelAndView mv = new ModelAndView("/apple/boardList");
//
//        List<BoardDto> list = boardService.selectBoardList();
//        mv.addObject("list", list);
//
//        return mv;
//    }
}
