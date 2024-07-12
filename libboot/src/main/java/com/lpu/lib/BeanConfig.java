package com.lpu.lib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;

import com.lpu.lib.algo.MyPasswordEncoder;
import com.lpu.lib.algo.NoEffectEncoder;

@Configuration
@ImportResource("classpath:beans.xml")
public class BeanConfig 
{
	//method 2 of creating a bean
	@Bean
	@Primary
	MyPasswordEncoder getMypEncoder()
	{
		return new NoEffectEncoder();
	}
}
