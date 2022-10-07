package com.example.signinclass.ui.home.User;

public class UserData {
    private String username;
    private String Pwd;
    private int userId;
    public int pwdFlag = 0;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPwd() {
        return Pwd;
    }
    public void setPwd (String Pwd) {
        this.Pwd = Pwd;
    }
    public int getUserId () {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public UserData(String username, String Pwd) {
        super();
        this.username = username;
        this.Pwd = Pwd;
    }
}
