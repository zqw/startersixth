package com.johney.fourth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.johney.fourth"})
public class ApiBaseApplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBaseApplicationApplication.class, args);
	}
}