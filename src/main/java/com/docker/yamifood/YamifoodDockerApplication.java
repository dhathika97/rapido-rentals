package com.docker.yamifood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YamifoodDockerApplication {

	public static void main(String[] args) {
		System.out.println("Spring Boot Application");
		SpringApplication.run(YamifoodDockerApplication.class, args);
	}

}
