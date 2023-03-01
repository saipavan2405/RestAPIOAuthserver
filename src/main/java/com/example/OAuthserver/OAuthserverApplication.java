package com.example.OAuthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;


@SpringBootApplication
@EnableEurekaClient
public class OAuthserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthserverApplication.class, args);
	}

}
