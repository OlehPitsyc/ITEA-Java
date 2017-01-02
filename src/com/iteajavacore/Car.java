package com.iteajavacore;

public class Car {
	String modelName = "";
	String color;
	int dorsAmount;
	double price;
	final String bodyNumber;
	static double rate = 1.0;

	{
		rate = 2.0;
	}
	/*
	 * public Car(String bodyNumber) { this.bodyNumber = bodyNumber; }
	 */

	public Car(String modelName, String color, int dorsAmount, double price, String bodyNumber) {
		this.modelName = modelName;
		this.color = color;
		this.dorsAmount = dorsAmount;
		this.price = price;
		this.bodyNumber = bodyNumber;
	}

	public Car(String modelName, String color) {
		this(modelName, color, 0, 0.0, null);
	}

	public Car(String modelName) {
		this(modelName, "blue", 0, 0.0, null);
	}

	@Override
	public String toString() {
		return "My name is " + this.modelName;
	}
}
