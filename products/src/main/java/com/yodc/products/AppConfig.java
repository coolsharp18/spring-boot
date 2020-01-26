package com.yodc.products;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Shoe getShoe()
	{
		return new Adidas();
	}
}
