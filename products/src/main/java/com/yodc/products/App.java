package com.yodc.products;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Shoe shoe = context.getBean(Shoe.class);
        shoe.catchPhrase();
    }
}
