package com.appsdeveloperblog.photoapp.api.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoAppApiUusersApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppApiUusersApplication.class, args);
    }

}
