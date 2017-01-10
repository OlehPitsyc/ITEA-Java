package com.itea.javacore.zoo.Audit;

public class Monkey extends Animal {

	private String name;

	public Monkey(String name, int hight, int width) {
		super(hight, width);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Monkey [name=" + name + "]";
	}

	public void print() {
		System.out.println("My name is " + this.name);
	}

}
