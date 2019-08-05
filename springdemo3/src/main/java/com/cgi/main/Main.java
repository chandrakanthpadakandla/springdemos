package com.cgi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.model.Employee;

public class Main {

	public static void main(String[] args) {
	    ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Employee emp=(Employee)context.getBean("employee");
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getDesig());
        System.out.println(emp.getAddress());
	}

}
