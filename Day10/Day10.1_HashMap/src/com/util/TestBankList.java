package com.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bank.AccountType;
import com.bank.BankAccount;

public class TestBankList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<BankAccount> list = new ArrayList<BankAccount>();
		list.add(new BankAccount(102, "Manisha",  "z_manisha@gmail.com", AccountType.saving, 80000));
		;

		list.add(new BankAccount(703, "Sonali", "a_sonali@gmail.com", AccountType.saving, 80000));
		list.add(new BankAccount(402, "Ritu", "A_ritu@gmail.com", AccountType.current, 90000));
		list.add(new BankAccount(152, "Ramesh", "X_ramesh@gmail.com", AccountType.loan, 40000));

	list.forEach(act->System.out.println(act));
	
	System.out.println("\n\n");
	
	
	list.stream().sorted().forEach(act->System.out.println(act));
	
	System.out.println("\n\n sort by name");
	
	Comparator<BankAccount> compObj1=(o1,o2)->{
		
		return (o1.getName().compareTo(o2.getName()));
	};
	
	Collections.sort(list, compObj1);
	
	list.forEach(act->System.out.println(act));
	
	System.out.println("\n\n sort by email");
	
	Collections.sort(list, (o1,o2)->(o1.getEmail().compareTo(o2.getEmail())));
	
	list.forEach(act->System.out.println(act));
	
	 
	
	
	
	}

}
