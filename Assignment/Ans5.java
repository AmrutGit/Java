
// 5. Write a program to accept a number and check if it is divisible by 5 and 7.
import java.util.Scanner;

public class Ans5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		if ((a % 5 == 0) && (a % 7 == 0))
			System.out.println("Number is divisible by 5 and 7");
		else
			System.out.println("Number is not divisible by 5 and 7");
	}

}
