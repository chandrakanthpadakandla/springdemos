package com.cgi.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main5{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		String code,name;
		 
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=null;
	try
	{
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","cgi123");
	
	String sql="INSERT INTO employee VALUES(?,?)";
	
	System.out.println("enter the code");
	code=scanner.next();
	System.out.println("enter the name");
	name=scanner.next();
	
	PreparedStatement statement=connection.prepareStatement(sql);
    statement.setString(1, code);
    statement.setString(2, name);
    System.out.println(sql);
	
    int n=statement.executeUpdate();
if(n>0)	{
		System.out.println("record inserted successfully");
		
	}
	}finally
	{
		connection.close();
	}
	
	}
	}



