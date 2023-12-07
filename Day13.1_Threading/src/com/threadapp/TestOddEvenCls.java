package com.threadapp;

public class TestOddEvenCls {

	public static void main(String[] args) {

System.out.println("----Main--------");
		
		EvenNumberCls even=new EvenNumberCls();
		OddNumberCls odd=new OddNumberCls();
		even.start();//implicitly call run
		odd.start();
//		even.showEven();
//		
//		odd.showOdd();
//		
		System.out.println("----Main Ends--------");
		
	}

}
