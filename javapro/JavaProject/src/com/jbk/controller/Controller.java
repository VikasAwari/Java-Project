package com.jbk.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.jbk.Model.Model;
import com.jbk.service.Service;

public class Controller {

	void AcceptData() throws ClassNotFoundException, SQLException
	{
		Service ss=new Service();
		ArrayList<Model> data = ss.AcceptData();
		System.out.println("**********Select Record From Database**********");
		for (Model record : data) 
		{
			System.out.println(record);
	    }
	}
	void insertData() throws ClassNotFoundException, SQLException
	{
		Service ss=new Service();
		String insertRecord = ss.insertRecord();
		System.out.println("****************insert Data In Database***************");
		System.out.println(insertRecord);
	}
	void DeleteData() throws ClassNotFoundException, SQLException
	{
		Service ss=new Service();
		String DeleteRecord = ss.DeleteRecord();
		System.out.println("****************Delete Data In Database***************");
		System.out.println(DeleteRecord);
	}
	void UpdateData() throws ClassNotFoundException, SQLException
	{
		Service ss=new Service();
		String UpdateRecord = ss.UpdateeRecord();
		System.out.println("****************insert Data In Database***************");
		System.out.println(UpdateRecord);
	}
	void AcceptRecord() throws ClassNotFoundException, SQLException
	{
		Service ss=new Service();
		ArrayList<Model> AcceptData = ss.AcceptRecord();
		System.out.println("****************insert Data In Database***************");
		for (Model record : AcceptData) 
		{
			System.out.println(record);
	    }
	}
	void insertDatas(int id,String name,String address,double salary) throws ClassNotFoundException, SQLException
	{
		Service ss=new Service();
		String insertRecord = ss.insertRecords(id,name,address,salary);
		System.out.println("****************insert Data In Database***************");
		System.out.println(insertRecord);
	}
	
	void RecordUpdate(int id,String name) throws ClassNotFoundException, SQLException
	{
		Service ss=new Service();
		String UpdateRecord = ss.RecordUpdate(id,name);
		System.out.println("****************insert Data In Database***************");
		System.out.println(UpdateRecord);
	}
	void DeleteRecords(int id) throws ClassNotFoundException, SQLException
	{
		Service ss=new Service();
		String DeleteRecord = ss.DeleteRecords(id);
		System.out.println("****************Record Delete FromDatabase***************");
		System.out.println(DeleteRecord);
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Controller cc=new Controller();
		cc.insertData();
		cc.AcceptData();
		//cc.DeleteData();
		//cc.UpdateData();
		//cc.AcceptRecord();
		//cc.insertDatas(666, "kumar","delhi", 56000);
		//cc.RecordUpdate(12,"Raju Kadam");
		//cc.DeleteRecords(666);
	}
}

