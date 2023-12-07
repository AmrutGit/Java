package com.code.runnable;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyThread3  tObj=new MyThread3();
		
		//or
		
		//Runnable rObj=new MyThread3();
		//or
		
	//	Runnable rObj1=tObj;
		
		
		Thread t1=new Thread(tObj);//
		t1.setName("Thread1");
		t1.start();
		
		System.out.println("-----ends-----");
		
	}

}
