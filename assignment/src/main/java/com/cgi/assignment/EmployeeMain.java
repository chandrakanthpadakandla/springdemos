package com.cgi.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        EmployeeRepository empRepo = new EmployeeRepository();
        Scanner scanner = new Scanner(System.in);
        int ch;
        while (true) {
            System.out.println("1) ADD EMPLOYEE");
            System.out.println("2) DISPLAY EMPLOYEE");
            System.out.println("3) DELETE EMPLOYEE");
            System.out.println("4) EXIT");
            System.out.println("Enter the choice");
            ch = scanner.nextInt();
            switch (ch) {
            case 1:
                Employee employee = new Employee();
                System.out.println("Enter the code");
                employee.setCode(scanner.next());
                System.out.println("Enter the name");
                employee.setName(scanner.next());
                empRepo.addEmployee(employee);
                break;
            case 2:
                List<Employee> list = empRepo.getEmployees();
                for (Employee e : list) {
                    System.out.println(e.getCode() + "\t" + e.getName());
                }
                break;
            case 3:
                 System.out.println("Enter the code");
                 String code=scanner.next();
                 boolean status=empRepo.deleteEmployee(code);
                 if(status==true){
                       System.out.println("Deleted");
                  }
                 else
                  {
                       System.out.println("Not deleted");
                  } 
                  break;
            case 4:
                System.exit(0);
            }
        }
    }
}





