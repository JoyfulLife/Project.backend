package project.backend.vo;

public class SignUpVO {

    private String user_ID;
    private String passWord;
    private String reconfirmPassWord;
    private String name;
    private String phoneNumber;
    private String gender;
    private String SuccessMessage;
    private String failMessage;


    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSuccessMessage() {
        return SuccessMessage;
    }

    public void setSuccessMessage(String successMessage) {
        SuccessMessage = successMessage;
    }

    public String getFailMessage() {
        return failMessage;
    }

    public void setFailMessage(String failMessage) {
        this.failMessage = failMessage;
    }
}
