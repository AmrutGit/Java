package com.tester;

import java.util.List;

import com.dal.CustomerDAL;
import com.pojo.Customer;

public class TestCRUDCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1:Get All Customers");
		CustomerDAL custDal = new CustomerDAL();

		List<Customer> list = custDal.getAllCustomer();
		//show all customer
		list.forEach(c->System.out.println(c));

	}

}
