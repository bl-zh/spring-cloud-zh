package org.zh.front.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.zh.api.service.UserService;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="org.zh.api.service")
public class FrontClientWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(FrontClientWebApplication.class, args);
	}

}