package com.cg.lab1.prob2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass
{
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
		Employeebean employee= (Employeebean) context.getBean("employee1");
		 System.out.println(employee);
	
		


}}
