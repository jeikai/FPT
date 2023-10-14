package com.example.AnnotationDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.File;
import java.lang.reflect.Field;


@SpringBootApplication
public class AnnotationDemoApplication {

	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
		// Context sẽ chưa các Bean có annotation là @Component
		ApplicationContext context= SpringApplication.run(AnnotationDemoApplication.class, args);
		Outfit outfit = context.getBean(Outfit.class);
		outfit.wear();
		System.out.println("Passed 1");
		Girl girlA = context.getBean(Girl.class);
		girlA.outfit.wear();

	}

}
//		Girl girlReflection = new Girl();
//		// Lấy ra field có tên là name (nếu ko tìm thấy thì throw Exception)
//		Field nameField = girlReflection.getClass().getDeclaredField("name");
//		// Cho phép truy cập tạm thời vì đang là private
//		nameField.setAccessible(true);
//		//Set giá trị mới
//		nameField.set(girlReflection, "Phúc");
//		System.out.println(girlReflection);