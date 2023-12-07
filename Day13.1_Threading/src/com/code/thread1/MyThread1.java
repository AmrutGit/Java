package com.code.thread1;

public class MyThread1 extends Thread {

	public void run() {
		System.out.println("-----Run Starts------Thread:"+Thread.currentThread().getName());

		for (int i = 1; i <= 10; i++) {
			System.out.println("Number=" + i);
			try {
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("-----Run Ends------");
	}

}
