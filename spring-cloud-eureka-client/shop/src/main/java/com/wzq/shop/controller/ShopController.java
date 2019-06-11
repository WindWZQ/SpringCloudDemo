package com.wzq.shop.controller;

import com.alibaba.fastjson.JSON;
import com.wzq.shop.bean.UserBean;
import com.wzq.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("what")
public class ShopController {

    @Autowired
    UserService userService;

    @GetMapping("getUser")
    public String callUser() {
        UserBean userBean = userService.getUser("call by shop");

        return "shop call user: " + JSON.toJSONString(userBean);
    }

    @GetMapping("test1")
    public String test1() {
        return "test from shop 1";
    }

    @GetMapping("test2")
    public String test2() {
        return "test from shop 2";
    }

    @GetMapping("test3")
    public String test3() {
        return "test from shop 3";
    }


}
