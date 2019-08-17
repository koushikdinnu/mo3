package com.cg.lab1.prob1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMainClass
{
public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
Employee employee= (Employee) context.getBean("employee");
 System.out.println(employee);
}
}
