package com.itea.java.core.homework.generic.cart;

import java.util.ArrayList;
import java.util.List;

import itea78910tasks.Computer;

public class AddComputerToTheCart {
	public static void main(String[] args) {
		Cart cart = new Cart();
		Desktop desktop = new Desktop("Intel Core", 1.7, "HP", 500, "Samsung", 1);
		Laptop laptop = new Laptop("Intel Core", 2.2, "Toshiba", 800, "HyperX", 2);
		Tablet tablet = new Tablet("Intel Core", 2.0, "Dell", 240, "Apple", 1);

		List<Computer> productsInTheCart = new ArrayList<>();

		cart.addToTheCart(desktop);
		cart.addToTheCart(laptop);
		cart.addToTheCart(tablet);

		cart.showCharacteristics();

		for (Computer computer : productsInTheCart) {
			computer.print();
		}

	}
}
