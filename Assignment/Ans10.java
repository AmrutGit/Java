
// 10:Write a program to find m to the power n. m=3 and n=4 so 3*3*3*3
import java.util.Scanner;

public class Ans10 {

	public static int power(int m, int n) {
		int a = 1;
		for (int i = 1; i <= n; i++) {
			a = a * m;
		}
		return a;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of m and n : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(power(m,n));				
	}

}
