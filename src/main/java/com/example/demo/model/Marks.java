package com.example.demo.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Marks {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student stu = context.getBean("student",Student.class);
		stu.show();
		
		
	}

}
