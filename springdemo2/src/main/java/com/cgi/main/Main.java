package com.cgi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.model.Book;

public class Main {

	public static void main(String[] args) {
	    ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	    Book book=(Book)context.getBean("book");
        System.out.println(book.getId());
        System.out.println( book.getTitle());
        System.out.println( book.getAuthor());
	    Book book2=(Book)context.getBean("book2");
	    System.out.println(book2.getId());
        System.out.println( book2.getTitle());
        System.out.println( book2.getAuthor());

	}

}
