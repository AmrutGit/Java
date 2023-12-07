package com.code.thread1;

public class TestMyThread2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("---Main starts By Thread:"+Thread.currentThread().getName());;
		
		
		//create new thread
		
		MyThread2 t1=new MyThread2("Thread_Even");
		t1.setPriority(Thread.MAX_PRIORITY);
		
		
		t1.start();//run()
		
		t1.join();
		System.out.println("---Main ends Thread:"+Thread.currentThread().getName());;
	}
}
