package com.code;

import java.text.*;
import java.util.Date;

public class Customer {
	private int id;
	private String name;
	private String email;
	private String password;
	private Date dob;
	private static int idcounter;
	private ServicePlan plan;
	private static SimpleDateFormat sdf;

	static {
		idcounter = 1001;
		sdf = new SimpleDateFormat("dd-mm-yyyy");
	}

	public Customer(String cname, String cemail, String cpassword, String cdob, String plan) throws ParseException {
		this.id = idcounter;
		idcounter++;
		this.name = cname;
		this.email = cemail;
		this.password = cpassword;
		this.dob = sdf.parse(cdob);
	}

	public double registrationAmount() {
		return 0;
	}

	public boolean check_email() {
		if (this.email.contains("@") && (this.email.endsWith(".com") || this.email.endsWith(".org")))
			return true;
		else
			return false;
	}
	
	public boolean check_password() {
		if ((this.password.length() > 4) &&(this.password.length()<10))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Account : Acc no. "+this.id+" Name "+this.name+" Email "+this.email;
	}
	
	
}
