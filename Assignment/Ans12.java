
// 12:Sum of series :
//	1+2+3+….+n

import java.util.Scanner;

public class Ans12 {

	public static int sum_series(int num) {
		int s = 0;
		for (int i = 1; i <= num; i++) {
			s = s + i;
		}
		return s;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms : ");
		int num = sc.nextInt();
		System.out.println(sum_series(num));

	}

}
