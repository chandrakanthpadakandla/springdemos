package com.cgi.annotationbasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
private int age;
private String name;
private Address adrress;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAdrress() {
	return adrress;
}
@Autowired
public void setAdrress(Address adrress) {
	this.adrress = adrress;
}

}
