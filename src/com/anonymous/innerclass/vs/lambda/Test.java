package com.anonymous.innerclass.vs.lambda;

public class Test {

	public static void main(String[] args) {
		Runnable runnable1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("Hi - "+i);
					
				}
			}
		};
		Thread thread1= new Thread(runnable1);
		thread1.start();
		
		Runnable runnable2 = ()->{
			for (int i = 0; i <3; i++) {
				System.out.println("Hello --"+i);
			}
		};
		Thread thread2= new Thread(runnable2);
		thread2.start();
		
		for (int i = 0; i < 30; i++) {
			System.out.println("Main---"+i);
			
		}
		
		
	}
}
