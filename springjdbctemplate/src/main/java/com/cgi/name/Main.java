package com.cgi.name;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.model.Employee;
import com.cgi.repo.EmployeeRepo;

public class Main {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
EmployeeRepo repo=(EmployeeRepo)context.getBean("emprepo");
Employee emp=(Employee)context.getBean("employee");
Scanner scanner=new Scanner(System.in);
int choice=0;
while(true){
System.out.println("1)ADD EMPLOYEE");
System.out.println("2)DELETE EMPLOYEE");
System.out.println("3)UPDATE EMPLOYEE");
System.out.println("4)DISPLAY EMPLOYEE");
System.out.println("5)EXIT");
System.out.println("ENTER YOUR CHOICE");
choice=scanner.nextInt();
switch(choice) {
case 1 : System.out.println("enter the code");
String code=scanner.next();
System.out.println("enter the name");
String name=scanner.next();
emp.setCode(code);
emp.setName(name);
boolean b=repo.addEmployee(emp);
if(b) {
	System.out.println("record added");
}
else {
System.out.println("not added");
}
break;
	
case 2:  System.out.println("Enter the code");
String code1=scanner.next();
boolean deleted=repo.deleteEmployee(code1);
if(deleted==true){
     System.out.println("Deleted");
}
else
{
     System.out.println("Not deleted");
} 
break;

case 3 : System.out.println("Enter the code to be updated ");
String code2=scanner.next();
emp.setCode(code2);

boolean updated=repo.updateEmployee(code2);
if(updated)
{
    System.out.println("Record succesfully updated");
}
else
{
    System.out.println("not updated");
}
break;
case 4 : List<Employee> empList=repo.displayEmployee();
for(Employee e:empList) {
	System.out.println(e.getCode()+"\t"+e.getName());

}
break;
case 5: System.exit(0);;
}

}
	}}
