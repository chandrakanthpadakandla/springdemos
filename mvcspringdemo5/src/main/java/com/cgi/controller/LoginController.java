package com.cgi.controller;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LoginController {
	  
   
	@RequestMapping("/")
    public String dispIndex() {
        return "login";
    }
	  @RequestMapping("/login")
	    public String login(Model model, @RequestParam String username, @RequestParam String password) {
	     
	      if ((username.equals("admin")) && (password.equals("admin"))) {
	            model.addAttribute("message","logged in successfully" );
		    	  System.out.println("loged successfully");

	            return "disp";
	        } else {
		    	  System.out.println("please enter valid username");

	           model.addAttribute("message","please enter admin as username and password" );
	            return "error";
	 
		  
		  
		  
	        }}
}
