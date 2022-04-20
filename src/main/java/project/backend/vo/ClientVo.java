package project.backend.vo;

public class ClientVo {
    private String userID = "";
    private String passWord = "";
    private String reconfirmPassWord = "";

    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getReconfirmPassWord() {
        return reconfirmPassWord;
    }
    public void setReconfirmPassWord(String reconfirmPassWord) {
        this.reconfirmPassWord = reconfirmPassWord;
    }
}
