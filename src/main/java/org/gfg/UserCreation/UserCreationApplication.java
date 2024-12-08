package org.gfg.UserCreation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserCreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCreationApplication.class, args);
	}

}
