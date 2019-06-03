package com.wzq.gitconf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
public class GitconfApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitconfApplication.class, args);
    }

}
