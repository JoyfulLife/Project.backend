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
}
