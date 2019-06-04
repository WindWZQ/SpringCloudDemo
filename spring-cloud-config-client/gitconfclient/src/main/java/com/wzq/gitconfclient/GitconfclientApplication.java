package com.wzq.gitconfclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GitconfclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitconfclientApplication.class, args);
    }

}
