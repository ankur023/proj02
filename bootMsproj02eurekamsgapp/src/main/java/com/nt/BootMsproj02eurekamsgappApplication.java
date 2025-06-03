package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class BootMsproj02eurekamsgappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsproj02eurekamsgappApplication.class, args);
	}

}
