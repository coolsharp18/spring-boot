package com.yodc.products;

import org.springframework.stereotype.Component;

@Component
public class Adidas implements Shoe
{

	public void catchPhrase()
	{
		System.out.println("Impossible is nothing");
	}
}
