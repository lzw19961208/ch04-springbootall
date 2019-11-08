package com.lzw.service;

import com.lzw.pojo.User;

import java.util.List;

public interface UserService {

    public String getUpwdByUname(String uname);

    public String getRoleByUname(String uname);

    //添加用户
    public int saveUser(User user);

    public int deleteUser(int uid);

    public User getUserByUid(int uid);

    public int updateUser(User user);

    public List<User> getUserList();
}
