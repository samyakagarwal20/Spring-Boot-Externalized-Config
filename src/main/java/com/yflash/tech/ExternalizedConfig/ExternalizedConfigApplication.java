package com.yflash.tech.ExternalizedConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySource("classpath:user-details.properties")
public class ExternalizedConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalizedConfigApplication.class, args);
	}

}
