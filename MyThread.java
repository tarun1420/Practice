package com;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=25;i++){
			System.out.println("child thread");
		}
	}

}
class ThreadDemo{
	public static void main(String[]args){
		MyThread m=new MyThread();
		Thread t=new Thread(m);
		t.start();
		for(int i=0;i<=25;i++){
			System.out.println("Parent thread");
		}
	}
}