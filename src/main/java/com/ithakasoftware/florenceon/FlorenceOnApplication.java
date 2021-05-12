package com.ithakasoftware.florenceon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(scanBasePackages = {"com.ithakasoftware"})
@EnableConfigurationProperties
public class FlorenceOnApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlorenceOnApplication.class, args);
	}

}
