import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import com.bank.AccountType;
import com.bank.BankAccount;
import com.util.BankUtil;

public class TestBankApp {

	public static void main(String[] args) {

		System.out.println(
				"1:show all \n2:add \n3:witdraw \n4:deposite  \n5:MoneyTransfer  \n6:get details by id \n7:Sort BankDetails");
		// get collection of bank
		Map<Integer, BankAccount> bank = BankUtil.getAllAccounts();

		Scanner sc = new Scanner(System.in);
		int ch;
		try {
			do {
				System.out.println("Choice");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					// show all accounts details
					// to get values form Map
					Collection<BankAccount> allActs = bank.values();// will return all values(BankAccount) from Map
					// show all acts details
					// for (BankAccount act : allActs)
//					{
//						System.out.println(act);
//					}

					// or

					allActs.forEach(act -> System.out.println(act));
					// show only Key
					System.out.println("----Keys------");
					Set<Integer> allKeys = bank.keySet();// Set<Integer>

					allKeys.forEach(i -> System.out.print(i + " "));
					System.out.println();

					break;
				case 2:// add new bank
					System.out.println("Enter Bank ActId Name  Email ActType Balance");
					BankAccount act1 = new BankAccount(sc.nextInt(), sc.next(), sc.next(),
							AccountType.valueOf(sc.next().toLowerCase()), sc.nextDouble());

					BankAccount obj = bank.putIfAbsent(act1.getActid(), act1);

					if (obj == null)
						System.out.println("Added...");
					else
						System.out.println("Duplicate ActID");

					break;
				case 3:
					// withdraw
					System.out.println("Enter ActID:");
					int actId = sc.nextInt();
					// get collection of all keys
					// Set<Integer> allKeys1 = bank.keySet();
					for (int no : bank.keySet()) {
						if (no == actId) {
							System.out.println("Enter Amount :");
							double amount = sc.nextDouble();

							BankAccount bk = bank.get(no);
							double bal = bk.withdraw(amount);
							System.out.println("Balance:" + bal);
						}
					}

					break;
				case 4:
					System.out.println("Enter ActID:");
					actId = sc.nextInt();
					// get collection of all keys
					// Set<Integer> allKeys1 = bank.keySet();
					for (int no : bank.keySet()) {
						if (no == actId) {
							System.out.println("Enter Amount ");
							double bal = bank.get(no).deposite(sc.nextDouble());
							System.out.println("Deposite:" + bal);
						}
					}
					break;
				case 5:
					// moneyTransfer(BankAccount reciver,double amount)
					System.out.println("Enter SendActId ReciverActID");
					int actId1 = sc.nextInt();
					int actId2 = sc.nextInt();
					// search actid are present
					for (int no : bank.keySet()) {//
						if (no == actId1) {
							BankAccount senderAct = bank.get(no);
							BankAccount reciverAct = bank.get(actId2);
							System.out.println("Enter Amount To Transfer");
							senderAct.moneyTransfer(reciverAct, sc.nextDouble());

							System.out.println("\n----------------");
							System.out.println(senderAct);
							System.out.println(reciverAct);
						}
					}

					break;
				case 7:
					TreeMap<Integer, BankAccount> treeMap=new TreeMap<Integer, BankAccount>(bank);
					
					treeMap.values().forEach(s->System.out.println(s));

 					
					
				}

			} while (ch <= 7);

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}

	}
}
