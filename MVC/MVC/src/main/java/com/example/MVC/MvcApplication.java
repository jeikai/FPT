package com.example.MVC;

import com.example.MVC.Service.GirlService;
import com.example.MVC.model.Girl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.example.MVC")
public class MvcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MvcApplication.class, args);
		try {
			GirlService girlService = context.getBean(GirlService.class);
			Girl girl = girlService.getName();
			System.out.println(girl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
