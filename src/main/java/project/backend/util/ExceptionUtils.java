package project.backend.util;

import project.backend.vo.*;

public class ExceptionUtils extends Exception {

//    private static final String MESSAGE = "중복 user_ID확인 error";

    public ExceptionUtils(SignUpVO signUpVO) {
        signUpVO.setFailMessage(" error 발생 ");
//        super(MESSAGE);
    }

    public ExceptionUtils(ClientVO clientVO) {
        clientVO.setFailMessage(" 로그인 실패 ");
    }

    public ExceptionUtils(CartVO cartVO) {
        cartVO.setFailMessage(" error 발생하였습니다. 다시 시도해주세요 ");
    }

    public ExceptionUtils(AdvertisingVO advertisingVO) {
        advertisingVO.setMessage(" error 발생 ");
    }

    public ExceptionUtils(CountAdvertisingVO countAdvertisingVO) {
        countAdvertisingVO.setMessage(" error 발생 ");
    }
}
