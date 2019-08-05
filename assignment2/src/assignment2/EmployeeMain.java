package assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
	    EmployeeRepository repo=new EmployeeRepository();

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
   case 1 :   Employee employee=new Employee();   
   System.out.println("Enter the code");
   employee.setCode(scanner.nextInt());
   System.out.println("Enter the name");
   employee.setName(scanner.next());
   repo.addEmployee(employee);
   break;
case 2 :   List<Employee> list=repo.getEmpList();
  for(Employee e : list) {
      System.out.println(e.getCode()+"\t"+e.getName());
   }
   break;

case  3 :   System.out.println("Enter the code");
    int code=scanner.nextInt();
   boolean status=repo.deleteEmployee(code);
   if(status==true){
         System.out.println("Deleted");
    }
   else
    {
         System.out.println("Not deleted");
    } 
    break;
case  4 :   System.out.println("Enter the code to be searched");
  int searchCode=scanner.nextInt();
  boolean found=repo.isExistEmployee(searchCode);
  if(found)  
   {
     System.out.println("Found");
   }
   break;
case 5 : System.exit(0);
}
}
}
}

