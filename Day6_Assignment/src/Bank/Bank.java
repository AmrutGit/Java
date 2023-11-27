package Bank;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------Welcome to Menu-----------");
		System.out.println("Press 1 to Create Account");
		System.out.println("Press 2 to Show Details");
		System.out.println("Press 3 to Deposit Amount");
		System.out.println("Press 4 to Withdraw Amount");
		System.out.println("Press 5 to Apply For Locker");
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: break;
		case 2: break;
		case 3: break;
		case 4: break;
		case 5: break;
		}
	}

}
