package com.learning.spring.spring_injection_parameter;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimple {
	
	private String name;
	private int age;
	private float height;
	private boolean programmer;
	private Long ageInSeconds;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public boolean isProgrammer() {
		return programmer;
	}
	
	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}
	
	public Long getAgeInSeconds() {
		return ageInSeconds;
	}
	
	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}

	public String toString() {
		return "Name: "+ name + "\n"
				       + "Age: "+ age + "\n"
				       + "Age in Seconds: "+ ageInSeconds + "\n"
				       + "Height: "+ height + "\n"
				       + "Is Programer?: "+ programmer;
	}
}
