package com.yodc.products;

import org.springframework.stereotype.Component;

@Component
public class Nike implements Shoe

{
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void catchPhrase()
	{
		System.out.println("Just Do It!");
	}
}
