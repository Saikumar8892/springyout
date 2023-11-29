package com.example.inversion_control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class InversionControlApplication {

	public static void main(String[] args) {
		
		//Spring bean container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobilesConfig.class);
		
		
		Mobiles obj = context.getBean("getIphoneObject",Mobiles.class);
		obj.getModelAndColor();
		Mobiles obj1 = context.getBean("getOnePlusObject",Mobiles.class);
		obj1.getModelAndColor();
	}

}
