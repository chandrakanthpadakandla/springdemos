package com.cgi.annotationbasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
Person person=(Person)context.getBean("person");
Address ad= person.getAdrress();
System.out.println(person.getAge());
System.out.println(person.getName());
System.out.println(ad.getHno());
System.out.println(ad.getCity());
System.out.println(ad.getState());
    }
}
