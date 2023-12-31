package com.jbk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

import com.jbk.Model.Model;

public class Dao {

	public ArrayList<Model> AccepData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeerecord", "root", "root");
  
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * From employee");

		ArrayList<Model> a1 = new ArrayList();

		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			double salary = rs.getDouble(4);

			Model m1 = new Model();

			m1.setId(id);
			m1.setName(name);
			m1.setAddress(address);
			m1.setSalary(salary);

			a1.add(m1);
		}

		return a1;
	}
	public String insertRecord() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeerecord", "root", "root");

		//Statement stmt = con.createStatement();
		String query="insert into employee(id,name,address,salary)values(14,'mohan','pune',23444)";
	    
		Statement stmt=con.createStatement();
		
		stmt.executeUpdate(query);
		
		return "Record Inserted Successfully";
	}	
	
	public String DeleteRecord() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeerecord", "root", "root");
        String query="Delete from employee where id=1";
	    
		Statement stmt=con.createStatement();
		
		int row = stmt.executeUpdate(query);
		if(row==1)
		{
			return "Record Deleted Successfully";
		}
		else
		{
			return " Data Not Exist In Database";
		}
	}
	
	public String updateRecord() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeerecord", "root", "root");
		
        String query="update employee set name='rajwardhan mohare' where id=144";
        Statement stmt=con.createStatement();
       
        int Update = stmt.executeUpdate(query);
        
		if(Update==1)
		{
			return "Data Updated Successfully";
		}else
		{
			return "Data Not Updated In Database";
		}
	}
	
	public ArrayList<Model> AccepRecord() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeerecord", "root", "root");

		
		PreparedStatement ps=con.prepareStatement("select * From employee");
		
		 ResultSet rs = ps.executeQuery();

		ArrayList<Model> a1 = new ArrayList();

		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			double salary = rs.getDouble(4);

			Model m1 = new Model();

			m1.setId(id);
			m1.setName(name);
			m1.setAddress(address);
			m1.setSalary(salary);

			a1.add(m1);
		}

		return a1;

	}
	
	public String insertRecords(int id, String name, String address, double salary) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeerecord", "root", "root");
		
		//Statement stmt = con.createStatement();
		
		int id1=id;
		String name1=name;
		String add=address;
		double sal=salary;
		
		String query="insert into employee(id,name,address,salary)values(?,?,?,?)";
		System.out.println("hi");
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, id1);
		ps.setString(2, name1);
		ps.setString(3, add);
		ps.setDouble(4, sal); 
	    ps.executeUpdate();

		return "Record Inserted Successfully";
	}	
	
	public String RecordUpdate(int id,String name) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeerecord", "root", "root");
		
	
        String query="update employee set name=? where id=?";
        PreparedStatement ps=con.prepareStatement(query);
   
        ps.setString(1, name);
        ps.setInt(2, id);
       
        int Update = ps.executeUpdate();
		if(Update==1)
		{
			return "Data Updated Successfully";
		}else
		{
			return "Data Not Updated In Database";
		}
	}
	public String DeleteRecords(int id) throws ClassNotFoundException, SQLException
	{
		System.out.println("hi");

		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeerecord", "root", "root");
        String query="Delete from employee where id=?";
	    
		PreparedStatement ps=con.prepareStatement(query);
	
		ps.setInt(1, id);
		int row = ps.executeUpdate();
		
		if(row==1)
		{
			return "Record Inserted Successfully";
		}
		else
		{
			return " Data Not Exist In Database";
		}
	}	 
}
