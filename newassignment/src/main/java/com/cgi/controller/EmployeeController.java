package com.cgi.controller;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.cgi.model.Employee;
import com.cgi.repo.EmployeeRepo;
@Controller
public class EmployeeController {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    EmployeeRepo emprepo = (EmployeeRepo) context.getBean("emprepo");
    @RequestMapping("/")
    public String addEmployee(Model model) {
        List<Employee> empList = emprepo.displayEmployee();
        model.addAttribute("empList", empList);
        return "index";
    }
    
    @RequestMapping("/saveEmployee")
    public String saveEmployee(@RequestParam String code, @RequestParam String name,Model model) {
        Employee emp = new Employee();
        emp.setCode(code);
        emp.setName(name);
        model.addAttribute("empList", emprepo.displayEmployee());
        emprepo.addEmployee(emp);
        return "index";
    }
    /*@RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam String code,Model model) {
        emprepo.deleteEmployee(code);
        model.addAttribute("empList",emprepo.displayEmployee());
        return "index";
    }
    @RequestMapping("/updateEmployee")
    public String updateEmployee(@RequestParam String code,Model model) {
        Employee emp = new Employee();
        emp.setCode(code);
        emprepo.updateEmployee(code);
        model.addAttribute("empList",emprepo.displayEmployee());
        return "index";
    }*/
}




