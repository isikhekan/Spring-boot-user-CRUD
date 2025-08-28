package com.example.user_crud_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.example.user_crud_management"})
@SpringBootApplication
public class UserCrudManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCrudManagementApplication.class, args);
	}

}
