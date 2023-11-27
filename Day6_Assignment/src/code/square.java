package code;
import java.util.Scanner;
public class square extends shape {
	Scanner sc = new Scanner(System.in);
	private int side;

	public double area() {
		System.out.print("Enter the value of side : ");
		side = sc.nextInt();
		return side * side;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " And side is : " + this.side;
	}

}
