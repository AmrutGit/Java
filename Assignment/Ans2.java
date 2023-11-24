
// 2:Write a program to adddition of two numbers.
import java.util.Scanner;

public class Ans2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int a = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int b = sc.nextInt();

		System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
	}

}
