package com.startup.aiweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.startup" })
public class AiWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiWebApplication.class, args);
	}

}
