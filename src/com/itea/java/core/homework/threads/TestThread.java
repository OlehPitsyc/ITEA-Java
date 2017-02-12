package com.itea.java.core.homework.threads;

public class TestThread {
	public static void main(String[] args) {

		Runnable threadRunnable = new ArticlesinTheBooks();
		Thread port1 = new Thread(threadRunnable, "Sience article");
		port1.start();

		MyThread thread = new MyThread();
		thread.start();

	}

}
