package com.cgi.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main4{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		String code,name;
		 
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=null;
	try
	{
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","cgi123");
	
	System.out.println("connected");
	
	Statement statement=connection.createStatement();
	
	System.out.println("enter the code");
	code=scanner.next();
	
	String sql="DELETE FROM employee WHERE code='"+code+"'";
	System.out.println(sql);
	
	
	
	
	int n=statement.executeUpdate(sql);
if(n>0)	{
		System.out.println("record deleted successfully");
		
	}
	}finally
	{
		connection.close();
	}
	
	}
	}



