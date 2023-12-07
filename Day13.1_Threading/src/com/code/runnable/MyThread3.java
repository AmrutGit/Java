package com.code.runnable;

public class MyThread3 implements Runnable {

	@Override
	public void run() {

		System.out.println("Odd   Started By Thread:    "+Thread.currentThread().getName() );
		
		for(int i=2;i<=10;i++)
		{
			if(i%2!=0)
			System.out.println("Even:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("---Odd end------By Thread:   "+Thread.currentThread().getName());
	
		
		
	}

}
