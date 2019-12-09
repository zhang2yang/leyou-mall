package com.leyou.user.service.impl;

import com.leyou.user.mapper.UserMapper;
import com.leyou.user.pojo.User;
import com.leyou.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author Administrator on 2019/12/8.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    private static final String KEY_PREFIX = "user:code:phone";
    private static final String KEY_PREFIX2 = "leyou:user:info";
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public Boolean checkData(String data, Integer type) {
        User user = new User();
        switch (type) {
            case 1:
                user.setUsername(data);
                break;
            case 2:
                user.setPhone(data);
                break;
            default:
                return null;
        }
        return this.userMapper.selectCount(user) == 0;
    }

    /**
     * 发送短信
     *
     * @param phone
     * @return
     */
    @Override
    public Boolean sendVerifyCode(String phone) {
        return null;
    }

    @Override
    public Boolean register(User user, String password) {
        return null;
    }

    @Override
    public User queryUser(String username, String password) {
        return null;
    }

    @Override
    public Boolean upadtePassword(String username, String oldPassword, String newPassword) {
        return null;
    }
}
