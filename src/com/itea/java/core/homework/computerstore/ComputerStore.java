package com.itea.java.core.homework.computerstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import itea78910tasks.Computer;

public class ComputerStore {
	public static void main(String[] args) {

		FirstComputer hp = new FirstComputer(16, "HP", 2.2);
		SecondComputer dell = new SecondComputer(12, "Dell", 2.6);
		ThirdComputer macBook = new ThirdComputer(16, "MacBookPro", 2.8);

		List<Computer> CatalogComputersList = new ArrayList<>();

		CatalogComputersList.add(hp);
		CatalogComputersList.add(dell);
		CatalogComputersList.add(macBook);

		System.out.println();
		for (Computer computer : CatalogComputersList) {
			computer.print();
		}
		System.out.println();

		for (int i = 0; i < CatalogComputersList.size(); i++) {
			Computer computer = (Computer) CatalogComputersList.get(i);
			computer.print();

		}
		System.out.println();
		Iterator<Computer> iterator = CatalogComputersList.iterator();
		while (iterator.hasNext()) {
			Computer computer = iterator.next();
			computer.print();

		}
	}
}
