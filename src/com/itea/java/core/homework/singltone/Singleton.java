package com.itea.java.core.homework.singltone;

public class Singleton {

	private static Singleton instance;

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void printMessage() {
		System.out.println("Hello, Singleton");
	}

	public void print() {
		System.out.println("Second message");
	}
}
