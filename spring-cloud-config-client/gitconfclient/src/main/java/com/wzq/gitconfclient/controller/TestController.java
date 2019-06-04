package com.wzq.gitconfclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${profile}")
    private String profile;

    @Value("${version}")
    private String version;

    @Value("${content}")
    private String content;

    @RequestMapping("hello")
    public String from() {
        return profile + "," + version + "," + content;
    }

}
