package com.code.thread1;

public class TestThread1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("---Main starts----");
		
		
		//create a new Thread
		
		MyThread1  t1=new MyThread1();
	 
	   //inform to CPU schedular that MyThread1 is ready to run
		 t1.start();//run()
	    // t1.stop();
		
		 //t1.join();
		System.out.println("T1:"+t1.isAlive());
		//
	// t1.start();//run time exception
		System.out.println("---Main Ends----");
		
	}

}
