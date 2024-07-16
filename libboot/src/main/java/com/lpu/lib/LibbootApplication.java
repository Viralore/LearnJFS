package com.lpu.lib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibbootApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(LibbootApplication.class, args);
//		ConfigurableApplicationContext context = SpringApplication.run(LibbootApplication.class, args);
		//context manages all created objects
		
		//ways to create bean
		//method 1 -> create in main method
		//method 2 -> BeanConfig.java and use @Configuration at top of class
		//method 3 -> bean.xml and use @ImportResource("classpath:beans.xml"), place it in src/main/java
//		MyPasswordEncoder bean = context.getBean(MyPasswordEncoder.class);
//		NoEffectEncoder bean2 = context.getBean(NoEffectEncoder.class);
//		System.out.println(bean);
//		System.out.println(bean2);
		
		System.out.println("Program Running");
		System.out.println("End of Summer PEP 2024 JFS");
	}

}
