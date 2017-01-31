package com.itea.javacore.innerclasses;

public class Test2InnerClass {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass objInnerClass = outerClass.new InnerClass();
		objInnerClass.hello();
	}
}
/*
 * Створюємо обєкть типу OuterClass, викликаємойого констурктор. За допомогою
 * бащового класу, створємо обєкт внутрішнього класу і викликаємо його
 * методПробуємо через загальний клас викликати методи внутрішніх класів
 */
