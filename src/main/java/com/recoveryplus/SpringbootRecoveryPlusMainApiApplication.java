package com.recoveryplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@PropertySources(value = { @PropertySource("classpath:message.properties"),
		@PropertySource("classpath:exception.properties"),
		@PropertySource("classpath:common.properties"),
		@PropertySource("classpath:profiles/${spring.profiles.active}/application.properties") })
public class SpringbootRecoveryPlusMainApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRecoveryPlusMainApiApplication.class, args);
	}

}
