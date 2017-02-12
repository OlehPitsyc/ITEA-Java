package com.itea.java.core.homework.threads;

public class TestMessages {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name + ": Старт Messages thread");

		Thread port1 = new Thread();
		port1.start();

		Runnable mes = new Messages();
		Thread port2 = new Thread(mes);
		port2.start();

		System.out.println(name + ": Чекаю поки другий потік завершить роботу");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + ": Роботу програми завершено");
	}
}
