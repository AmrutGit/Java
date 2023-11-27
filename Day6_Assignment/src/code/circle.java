package code;

import java.util.Scanner;

public class circle extends shape {
	Scanner sc = new Scanner(System.in);
	private int radius;

	public double area() {
		// TODO Auto-generated method stub
		System.out.print("Enter value of radius : ");
		radius = sc.nextInt();
		return 2 * 3.14 * radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Radius is " +this.radius;
	}

}
