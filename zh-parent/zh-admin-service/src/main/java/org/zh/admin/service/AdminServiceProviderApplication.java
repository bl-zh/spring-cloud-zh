package org.zh.admin.service;

import java.util.Set;
import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories(basePackages = "org.zh.domain.repository")
@EntityScan("org.zh.domain.entity")
public class AdminServiceProviderApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceProviderApplication.class);
	@Autowired
	private Environment environment;
	@Autowired
	private ContextRefresher contextRefresher;

	public static void main(String[] args) {
		SpringApplication.run(AdminServiceProviderApplication.class, args);
	}

	@Scheduled(fixedRate = 5000, initialDelay = 3000)
	public void autoFreshConfig() {
		Set<String> updatedPropertyNames = contextRefresher.refresh();
		updatedPropertyNames.forEach(propertyName -> LOGGER.info("--------auto fresh key:{},value:{} success!",
				propertyName, environment.getProperty(propertyName)));
	}

}
