package project.backend.vo;

public class SignUpVO {

    private String userID;
    private String passWord;
    private String reconfirmPassWord;
    private String name;
    private String phoneNumber;
    private String gender;


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
}
