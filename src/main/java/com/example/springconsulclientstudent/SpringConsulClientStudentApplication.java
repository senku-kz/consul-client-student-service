package com.example.springconsulclientstudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringConsulClientStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConsulClientStudentApplication.class, args);
    }

}
