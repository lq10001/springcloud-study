package com.ly;

import com.ly.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class MyserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyserverApplication.class, args);
	}

//	@Bean
//	public AccessFilter accessFilter() {
//		return new AccessFilter();
//	}
}
