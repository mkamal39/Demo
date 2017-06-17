package com.shopzone.shopzoneproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShopzoneproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopzoneproxyApplication.class, args);
	}
}
