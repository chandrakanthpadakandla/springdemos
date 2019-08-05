package com.cgi.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=null;
	try
	{
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","cgi123");
	System.out.println("connected");
	Statement statement=connection.createStatement();
	int n=statement.executeUpdate("INSERT INTO employee VALUES('E0005','karthik')");
if(n>0)	{
		System.out.println("record updated successfully");
		
	}
	}finally
	{
		connection.close();
	}
	
	}
	}



