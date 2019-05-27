package com.wzq.shop.service;

import com.wzq.shop.bean.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user")
public interface UserService {

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    UserBean getUser(@RequestParam("msg") String msg);

}
