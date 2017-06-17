package com.shopzone.shopzonediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShopzonediscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopzonediscoveryApplication.class, args);
	}
}
