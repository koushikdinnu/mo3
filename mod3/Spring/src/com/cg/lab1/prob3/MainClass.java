package com.cg.lab1.prob3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.lab1.prob2.Employeebean;

public class MainClass {
	
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("prob3.xml");
			Sbu sbu= (Sbu) context.getBean("sbu");
			 System.out.println(sbu);
	}
}
