package com.aouth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class DemoApplication extends SpringBootServletInitializer {

// ddddddddddddddddd
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
