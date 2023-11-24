
// 6. Write a program, which accepts annual basic salary of an employee and calculates 
//and displays the 
//Income tax as per the following rules. 
//Basic: < 1, 50,000 Tax = 0
// 1, 50,000 to 3,00,000 Tax = 20% 
// > 3,00,000 Tax = 30% 

import java.util.Scanner;

public class Ans6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an annual basic salary of employee : ");
		int sal = sc.nextInt();
		double tax = 0.0;
		if (sal < 150000)
			System.out.println("Tax is : "+tax);
		else if (sal >= 150000 && sal <300000) {
			tax = sal * 0.2 ;
			System.out.println("Tax is : "+tax);
		}
		else if (sal >= 300000) {
			tax = sal * 0.3 ;
			System.out.println("Tax is : "+tax);			
		}
	}

}
