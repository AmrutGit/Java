package code;

import java.util.Scanner;

public class rectangle extends shape {
	Scanner sc = new Scanner(System.in);
	private int l;
	private int b;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		System.out.print("Enter value of length and bredth : ");
		l = sc.nextInt();
		b = sc.nextInt();
		return l * b;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "And" + " length is " + this.l + " bredth is " + this.b;
	}
}
