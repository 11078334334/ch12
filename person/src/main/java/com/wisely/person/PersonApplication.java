package com.wisely.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class PersonApplication {
	@RequestMapping("/")
	public String home() {
		return "Hello Docker!!看到这句话没有？Person";
	}
	   public static void main(String[] args) {
	        SpringApplication.run(PersonApplication.class, args);
	    }

}
