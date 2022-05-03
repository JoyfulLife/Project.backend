package project.backend.vo;

import java.util.HashMap;
import java.util.Map;

public class ResponseVO {

    private String userID = "wh";
    protected Map<String, Object> data = new HashMap();

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    public Map<String, Object> getData() {
        return this.data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public void appendDataMap(String key, Object obj) {
        this.data.put(key, obj);
    }
private String age;
    private String idx = "123123";
    private String start_date222;
    private String deadline333;
    private String header555;
    private String description666;
    private String image_path777;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getStart_date222() {
        return start_date222;
    }

    public void setStart_date222(String start_date222) {
        this.start_date222 = start_date222;
    }

    public String getDeadline333() {
        return deadline333;
    }

    public void setDeadline333(String deadline333) {
        this.deadline333 = deadline333;
    }

    public String getHeader555() {
        return header555;
    }

    public void setHeader555(String header555) {
        this.header555 = header555;
    }

    public String getDescription666() {
        return description666;
    }

    public void setDescription666(String description666) {
        this.description666 = description666;
    }

    public String getImage_path777() {
        return image_path777;
    }

    public void setImage_path777(String image_path777) {
        this.image_path777 = image_path777;
    }
}
