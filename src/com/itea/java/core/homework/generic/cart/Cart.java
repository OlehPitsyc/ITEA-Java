package com.itea.java.core.homework.generic.cart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import itea78910tasks.Computer;

public class Cart<Computer> {
	List<Computer> CatalogComputersList = new ArrayList<>();

	public void addToTheCart(Computer obj) {
		CatalogComputersList.add(obj);
	}

	public void removeFromTheCart(Computer obj) {
		CatalogComputersList.remove(obj);
	}

	public void showCharacteristics() {
		for (Computer computer : CatalogComputersList) {
			System.out.println(computer);
		}
	}
}
