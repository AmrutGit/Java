
// 3:Write a program to swap two numbers
import java.util.Scanner;

public class Ans8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int a = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int b = sc.nextInt();
		System.out.println("Numbers after swap " + a + " and " + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Numbers before swap " + a + " and " + b);

	}

}
