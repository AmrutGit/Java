package Bank;

import java.util.Scanner;

public class BankAccount {
	Scanner sc = new Scanner(System.in);
	private int ac_id = 1001;
	private String name;
	private double balance;
	private locker lObj;

	public void apply_locker(int lockerId, int months) {
		this.lObj = new locker(lockerId, months);
		System.out.println("----Done----");
	}

	public void CreateAccount() {
		System.out.println("Please enter your name : ");
		name = sc.next();
		System.out.println("Please enter amount you want to deposit initially : ");
		balance = sc.nextDouble();
		System.out.println("Account Created Successfully!");
	}

	public void ShowDetails() {
		System.out.println("Account Number : " + ac_id);
		System.out.println("Account Holder Name : " + name);
		System.out.println("Current Balance : " + balance);
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Balance after withdraw is : " + balance);
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Balance after deposit is : " + balance);
	}

	private class locker {
		private int lockerId;
		private int months, rate;

		public locker(int lockerId, int months) {
			rate = 1000;
			this.lockerId = lockerId;
			this.months = months;
		}

		@Override
		public String toString() {
			return "Locker [lockerId=" + lockerId + ", Charges=" + (rate * months) + "]";
		}
	}

}
