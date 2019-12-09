package com.leyou.user.api;


import com.leyou.user.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator on 2019/12/8.
 */
public interface UserApi {
    /**
     * 用户验证
     */
    @GetMapping("query")
    User queryUser(@RequestParam("username")String username, @RequestParam("password")String password);

}
