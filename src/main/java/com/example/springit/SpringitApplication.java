package com.example.springit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.example.springit.config.SpringitProperties;

@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
public class SpringitApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringitApplication.class);
	@Autowired
	private SpringitProperties springitProperties;

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			System.out.println("Welcome Msg:" + springitProperties.getWelcomeMessage());
			logger.warn("Default warning");
		};
	}

}
