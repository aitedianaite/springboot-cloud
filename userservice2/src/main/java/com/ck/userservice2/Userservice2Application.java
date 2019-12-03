package com.ck.userservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Userservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Userservice2Application.class, args);
	}

}
