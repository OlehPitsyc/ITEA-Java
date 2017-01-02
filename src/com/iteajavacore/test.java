package com.iteajavacore;

public class test {

	public void bark() {
		System.out.println("say bark");
	}

	public String name(String name) {
		// String myName = name;
		return name;
	}

	public static void main(String[] args) {
		test[] dog = new test[2];
		dog[0] = new test();
		dog[0].bark();
		System.out.println(dog[0].name("Tuzik"));
		dog[0].bark();
	}

}
