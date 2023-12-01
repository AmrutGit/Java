package com.dal;

import java.sql.Connection;
import java.util.List;

import com.pojo.Customer;
import com.util.DbUtil;

public class CustomerDAL {
	
	private static Connection con;
	public  CustomerDAL()
	{
		try {
			con=DbUtil.getDbConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//CRUD
	
	//select * from cutsomer R

	public List<Customer> getAllCustomer()
	{
		
		return null;
	}
    //Insert into Customer
	public int addNewCustomer(Customer   obj)
	{
		return 0;
	}
	public int updateCustomer(Customer   obj)
	{
		return 0;
	}
	public int deleteCustomer(int custid)
	{
		return 0;
	}
}
