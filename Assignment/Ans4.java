
// 4. Write a program to accept an integer and check if it is even or odd.
import java.util.Scanner;

public class Ans4 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int a = sc.nextInt();

		if (a % 2 == 0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}

}
