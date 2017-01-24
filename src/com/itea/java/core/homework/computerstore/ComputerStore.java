package com.itea.java.core.homework.computerstore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import itea78910tasks.Computer;

public class ComputerStore {
	public static void main(String[] args) {

		FirstComputer hp = new FirstComputer(16, "HP", 2.2);
		SecondComputer dell = new SecondComputer(12, "Dell", 2.6);
		ThirdComputer macBook = new ThirdComputer(16, "MacBookPro", 2.8);

		List<Computer> CatalogComputersList = new ArrayList<>();
		Map<Integer, Computer> ComputersMap = new HashMap<>();

		ComputersMap.put(1, hp);
		ComputersMap.put(2, dell);
		ComputersMap.put(3, macBook);

		for (Computer computer : ComputersMap.values()) {
			computer.print();
		}
		System.out.println();
		ComputersMap.forEach((k, v) -> v.print());

	}
}
