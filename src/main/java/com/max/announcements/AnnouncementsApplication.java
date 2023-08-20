package com.max.announcements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AnnouncementsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnnouncementsApplication.class, args);
    }

}
