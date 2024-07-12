package com.lpu.lib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lpu.lib.algo.MyPasswordEncoder;
import com.lpu.lib.algo.NoEffectEncoder;

@SpringBootApplication
public class LibbootApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(LibbootApplication.class, args);
		//context manages all created objects
		
		//ways to create bean
		//method 1 -> create in main method
		//method 2 -> BeanConfig.java and use @Configuration at top of class
		//method 3 -> bean.xml and use @ImportResource("classpath:beans.xml"), place it in src/main/java
		MyPasswordEncoder bean = context.getBean(MyPasswordEncoder.class);
		NoEffectEncoder bean2 = context.getBean(NoEffectEncoder.class);
		System.out.println(bean);
		System.out.println(bean2);
	}

}
