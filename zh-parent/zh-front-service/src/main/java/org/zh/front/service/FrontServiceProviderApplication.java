package org.zh.front.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories(basePackages="org.zh.domain.repository")
@EntityScan("org.zh.domain.entity")
public class FrontServiceProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(FrontServiceProviderApplication.class, args);
	}

}
