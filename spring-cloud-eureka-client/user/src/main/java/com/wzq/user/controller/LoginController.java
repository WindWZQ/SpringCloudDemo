package com.wzq.user.controller;

import com.wzq.user.bean.UserBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sign")
public class LoginController {

    @GetMapping("login")
    public UserBean login(@RequestParam("msg") String msg) {
        System.out.println("msg: " + msg);

        UserBean userBean = new UserBean();
        userBean.setId(1);
        userBean.setName("wang");
        userBean.setPhone("13800000000");
        userBean.setMsg(msg);

        return userBean;
    }

}
