package com.infogain.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infogain.app.bean.Employee;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext spring = new ClassPathXmlApplicationContext("abc.xml");
		// Spring container 
		Employee e = (Employee)spring.getBean("emp102"); // asking spring to give me employee
		System.out.println(e);

	}

}
