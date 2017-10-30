package com.saurabh;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Circle implements InitializingBean,DisposableBean{

	
	private Point center;

	
	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier(value="center1")
	public void setCenter(Point center) {
		this.center = center;
	}


	@Override
	public String toString() {
		return "Circle [center=" + center + "]";
	}


	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle :: "+center);
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After setting properties of circle");
	}


	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("In destroy");
	}
	
	public void displayInit(){
		System.out.println("In init of displayinit");
	}
	
	public void displayDestroy(){
		System.out.println("In init of displayDestroy");
	}
	
	
}
