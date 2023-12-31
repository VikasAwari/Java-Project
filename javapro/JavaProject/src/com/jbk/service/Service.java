package com.jbk.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.jbk.Model.Model;
import com.jbk.dao.Dao;

public class Service {

	public ArrayList<Model>  AcceptData() throws ClassNotFoundException, SQLException
	{
		Dao dd=new Dao();
		ArrayList<Model> list = dd.AccepData();
		return list;	
	}
	
	public String insertRecord() throws ClassNotFoundException, SQLException
	{
	    Dao dd=new Dao();
		String data = dd.insertRecord();
		System.out.println(data);
		return data;
		
	}
	public String DeleteRecord() throws ClassNotFoundException, SQLException
	{
	    Dao dd=new Dao();
		String data = dd.DeleteRecord();
		return data;
		
	}
	
	public  ArrayList<Model> AcceptRecord() throws ClassNotFoundException, SQLException
	{
	    Dao dd=new Dao();
		  ArrayList<Model> Record = dd.AccepRecord();
		return Record;
		
	}
	
	
	public String UpdateeRecord() throws ClassNotFoundException, SQLException
	{
	    Dao dd=new Dao();
		String data = dd.updateRecord();
		return data;
		
	}
	
	public String insertRecords(int id,String name,String address,double salary) throws ClassNotFoundException, SQLException
	{
	    Dao dd=new Dao();
		String data = dd.insertRecords(id,name,address,salary);
		System.out.println(data);
		return data;
		
	}
	
	public String RecordUpdate(int id,String name) throws ClassNotFoundException, SQLException
	{
	    Dao dd=new Dao();
		String data = dd.RecordUpdate(id,name);
		return data;
		
	}
	public String DeleteRecords(int id) throws ClassNotFoundException, SQLException
	{
	    Dao dd=new Dao();
		String data = dd.DeleteRecords(id);
		return data;
		
	}
}
