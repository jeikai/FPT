package com.example.Configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ConfigurationApplication.class, args);
		User me = (User) context.getBean("User");
		System.out.println(me.toString());
		User me2 = (User) context.getBean("Database");
	}
}
