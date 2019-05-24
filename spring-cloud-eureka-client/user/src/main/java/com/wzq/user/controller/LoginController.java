package com.wzq.user.controller;

import com.wzq.user.bean.UserBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class LoginController {

    @GetMapping("login")
    public UserBean login() {
        UserBean userBean = new UserBean();
        userBean.setId(1);
        userBean.setName("wang");
        userBean.setPhone("13800000000");

        return userBean;
    }

}
