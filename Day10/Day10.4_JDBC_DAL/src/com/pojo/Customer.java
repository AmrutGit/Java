package com.pojo;
//POJO:DTO(Data Transfer Object)
public class Customer {
// custid | custname | email          | password   | age
	private int custid;
	private String custname,email,password;
	private int age;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Customer(int custid, String custname, String email, String password, int age) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.email = email;
		this.password = password;
		this.age = age;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", email=" + email + ", password=" + password
				+ ", age=" + age + "]";
	}
	
	
	
}
