package project.backend.util;

import project.backend.vo.AdvertisingVO;
import project.backend.vo.ClientVO;
import project.backend.vo.SignUpVO;

public class ExceptionUtils extends Exception {

//    private static final String MESSAGE = "중복 user_ID확인 error";

    public ExceptionUtils(SignUpVO signUpVO) {
        signUpVO.setFailMessage("error 발생");
//        super(MESSAGE);
    }

    public ExceptionUtils(ClientVO clientVO) {
        clientVO.setLoginStatus("error 발생");
//        super(MESSAGE);
    }
}
