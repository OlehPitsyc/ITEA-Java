package com.itea.java.core.homework.threads;

public class Messages implements Runnable {

	String msgArray[] = { "Hello", "ITEA", "Java", "Core" };

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for (String message : msgArray) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + ": " + message);
		}

	}

}
