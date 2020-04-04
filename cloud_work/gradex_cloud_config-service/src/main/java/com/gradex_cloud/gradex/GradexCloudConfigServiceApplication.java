package com.gradex_cloud.gradex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GradexCloudConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradexCloudConfigServiceApplication.class, args);
	}

}
