package exercise1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employeeList=new ArrayList<Employee>();
		Scanner scanner=new Scanner(System.in);
		int choice=0;
		while(true){
		System.out.println("1)ADD EMPLOYEE");
		System.out.println("2) DISPLAY EMPLOYEE");
		System.out.println("3) DELETE EMPLOYEES");
		System.out.println("4) SEARCH EMPLOYEES");
		System.out.println("5)EXIT");
		choice=scanner.nextInt();
	
		switch(choice)
   {
     case 1:Employee employee=new Employee();
            System.out.println("enter the employee code");
            int code=scanner.nextInt();
            employee.setCode(code);
            System.out.println("enter the name");
            String name=scanner.next();
            employee.setName(name);
            employeeList.add(employee);
            break;
     case 2: System.out.println("");   
     for (Employee s : employeeList) {
    	 System.out.println(s.getCode()+ "\t" +s.getName());
     }
    	 break;
     
     case 3:Iterator<Employee> iterator= employeeList.iterator();
     System.out.println("Enter the code number to be deleted");
     code=scanner.nextInt();
     while(iterator.hasNext())
     {
    	 Employee std=iterator.next();
         if(std.getCode()==code)
         {
             iterator.remove();
          
         }
         break;
   } 
     case 4:
       System.out.println("search an employee by entering name");
       String name1 = scanner.next();
       for(Employee e:employeeList) {
           if(e.getName().equals(name1)) {
               System.out.println(e.getName()+"\t"+e.getCode());
           }
       }
       break;


     }
     
		}}
   
		}

