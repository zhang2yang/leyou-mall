package com.leyou.user.service;

import com.leyou.user.pojo.User;

/**
 * @author Administrator on 2019/12/8.
 */
public interface UserService {
    /**
     * 检查用户是否可用
     * @param data
     * @param type
     * @return
     */
    Boolean checkData(String data,Integer type);

    /**
     * 发送手机验证码
     * @param phone
     * @return
     */
    Boolean sendVerifyCode(String phone);

    /**
     * 用户注册
     * @param user
     * @param password
     * @return
     */
    Boolean register(User user ,String password);

    /**
     * 用户验证
     * @param username
     * @param password
     * @return
     */
    User queryUser(String username,String password);

    /**
     * 用户修改密码
     * @param username
     * @param oldPassword
     * @param newPassword
     * @return
     */
    Boolean upadtePassword(String username,String oldPassword,String newPassword);
}
