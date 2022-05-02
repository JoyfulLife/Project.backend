package project.backend.test;

import java.util.List;

public interface BoardService {
    List<BoardDto> selectBoardList() throws Exception;
}
