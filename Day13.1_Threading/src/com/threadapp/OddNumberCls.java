package com.threadapp;

public class OddNumberCls  extends Thread{
	
	public void run()
	{
		showOdd();
	}
	
	public void showOdd()
	{
		System.out.println("---Odd------");
		
		for(int i=2;i<=10;i++)
		{
			if(i%2!=0)
			System.out.println("\t\tOdd"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("---Odd End------");
		
	}
}
