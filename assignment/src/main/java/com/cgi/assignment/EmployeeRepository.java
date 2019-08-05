package com.cgi.assignment;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class EmployeeRepository {
    private Connection connection;
    private PreparedStatement statement;
    public EmployeeRepository() {
        // load the driver
        // initialise the connection
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "cgi123");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public boolean addEmployee(Employee employee) {
        String sql = "insert into employee values(?,?)";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, employee.getCode());
            statement.setString(2, employee.getName());
            int n = statement.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
        // get the PreparedStatement object
        // get the data from employee object
        // if the data got added successfully , return true
    }
    public boolean deleteEmployee(String code) {
        String sql = "delete from employee where code=?";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, code);
            int n = statement.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
        // get the code from main
        // delete the record for the code entered
        // if the record got deleted , return true
    }
    public List<Employee> getEmployees() {
        List<Employee> empList = new ArrayList<Employee>();
        try {
            ResultSet rs = statement.executeQuery("select * from test.employee");
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setCode(rs.getString(1));
                emp.setName(rs.getString(2));
                empList.add(emp);
            }
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return empList;
    }
    // display all the employees from the table with code and name
}