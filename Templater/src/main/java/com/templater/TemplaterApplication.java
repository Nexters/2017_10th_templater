package com.templater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ComponentScan(basePackages = {"com.templater.*"})
//@EntityScan("com.ensat.entities")
//@EnableJpaRepositories("com.ensat.repositories")
public class TemplaterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplaterApplication.class, args);
		
	}
}
