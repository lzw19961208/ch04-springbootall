package com.lzw.pojo;

public class User {

    private int uid;
    private String uname;
    private String upwd;
    private String role;

    public User() {
    }

    public User(int uid, String uname, String upwd, String role) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
        this.role = role;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
