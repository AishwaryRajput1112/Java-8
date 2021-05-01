package com.method.references;

public class UsingRunnable {
	
	public void run() {
		System.out.println("Hii");
	}
	
	public static void main(String[] args) {
		Runnable r = new UsingRunnable()::run;
		Thread t = new Thread(r);
		t.start();
	}

}
