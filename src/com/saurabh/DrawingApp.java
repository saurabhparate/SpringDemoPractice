package com.saurabh;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public  class DrawingApp {

	//abstract void display(){};
	
	public static void main(String[] args) {
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Circle circle = (Circle)applicationContext.getBean("circle");
		applicationContext.registerShutdownHook();
		circle.draw();
	}

}
