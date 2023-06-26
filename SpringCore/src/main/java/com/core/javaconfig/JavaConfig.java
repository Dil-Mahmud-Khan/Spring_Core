package com.core.javaconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.core.javaconfig")
public class JavaConfig {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	
	
	@Bean
	public Student getStudent() {
		
		//creating a new student object
		Student student=new Student(getSamosa());
		return student;
	}
	
}
