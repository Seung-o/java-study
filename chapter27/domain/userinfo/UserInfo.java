package chapter27.domain.userinfo;

public class UserInfo {

    private String userId;
    private String passwd;
    private String userName;

    public UserInfo(String userId, String passwd, String userName) {
        this.setUserId(userId);
        this.setPasswd(passwd);
        this.setUserName(userName);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
