package com.code.thread1;

public class MyThread2  extends Thread{

	
	public MyThread2(String name) {
		
		super(name);
		
	}
	
	public void run()
	{
		System.out.println("Even Method Started By Thread:    "+Thread.currentThread().getName() );
	
		for(int i=2;i<=10;i++)
		{
			if(i%2==0)
			System.out.println("Even:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("---Even end------By Thread:   "+Thread.currentThread().getName());
	
	}

}
