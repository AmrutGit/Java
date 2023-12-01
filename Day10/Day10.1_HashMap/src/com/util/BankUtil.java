package com.util;
import java.util.HashMap;
import java.util.Map;

import com.bank.*;//* :all  types
public class BankUtil {

	public static Map<Integer, BankAccount> getAllAccounts(){
	//key value
	//Map<Integer,String>
	//Map<Integer, Integer>
	//Map<String, Integer>
	//Map<Customer, CustomerDetails>
	BankAccount act1=new BankAccount(101, "Nisha", "n@gmail.com", AccountType.current, 10000);
	
	//Map<Integer, BankAccount> map=new HashMap<Integer, BankAccount>();
	  
	Map<Integer, BankAccount> bank=new HashMap<Integer, BankAccount>();
	
	bank.put(101, act1);
	bank.put(102, new BankAccount(102, "Manisha", "manisha@gmail.com", AccountType.saving, 80000));
	bank.put(703, new BankAccount(703, "Sonali", "sonali@gmail.com", AccountType.saving, 80000));
	bank.put(402, new BankAccount(402, "Ritu", "ritu@gmail.com", AccountType.current, 90000));
	bank.put(152, new BankAccount(152, "Ramesh", "ramesh@gmail.com", AccountType.loan,40000));
	
	return bank;
	}
	
	
	
	
	
	
	
}
