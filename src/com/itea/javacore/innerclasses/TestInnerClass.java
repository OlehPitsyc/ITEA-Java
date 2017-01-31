package com.itea.javacore.innerclasses;

public class TestInnerClass {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass objInnerClass = outerClass.getInner();
		objInnerClass.hello();
	}
	/*
	 * Створюємо обєкть типу OuterClass, викликаємойого констурктор. За
	 * допомогою бащового класу, створємо обєкт внутрішнього класу і викликаємо
	 * його метод. Пробуємо через загальний клас викликати методи внутрішніх
	 * класів
	 */

}
