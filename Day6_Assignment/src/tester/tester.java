package tester;

import code.*;

public class tester {
// 	tight coupling
	public static void showArea(shape Obj) {
		Obj.area();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle cirObj = new circle();
		System.out.println("Area of circle : "+cirObj.area());
		System.out.println(cirObj);

		rectangle recObj = new rectangle();
		System.out.println("Area of rectangle is : "+recObj.area());
		System.out.println(recObj);
		
		square sqObj = new square();
		System.out.println("Area of square is : "+sqObj.area());
		System.out.println(sqObj);
	}

}
