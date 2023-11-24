
// 11:Check if number is a prime number or not.: 
import java.util.Scanner;

public class Ans11 {

	public static String prime_check(int num) {
		int flag = 0;
		if ((num == 1) || (num == 2) || (num == 3))
			return "Number is a Prime number";
		else if (num > 3){
			for (int i = 2; i<Math.sqrt(num);i++) {
				if (num % i == 0) {
					flag = 1;
				}
			}			
		}
		if (flag == 0)
			return "Number is a Prime number";
		else
			return "Number is not a Prime number";
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if prime or not : ");
		int n = sc.nextInt();
		System.out.println(prime_check(n));
	}

}
