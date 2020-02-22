package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {
    //通过用户Id获取对用用户
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;
    //telphone用户注册手机 password用户加密后的密码
    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}

