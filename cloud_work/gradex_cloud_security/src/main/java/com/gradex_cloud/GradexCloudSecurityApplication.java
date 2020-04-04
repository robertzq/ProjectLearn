package com.gradex_cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
@ComponentScan(basePackages = "com") // 默认扫描是当前包下的路径
@MapperScan("com.gradex_cloud.dao")
public class GradexCloudSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradexCloudSecurityApplication.class, args);
	}
//
//	@Autowired
//	private AuthenticationProvider authenticationProvider;
// 
//	@Bean
//	public AuthenticationManager authenticationManager(){
//		return new ProviderManager(Arrays.asList(authenticationProvider));
//	}
}
