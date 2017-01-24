package com.itea.java.core.homework.computerstore;

import itea78910tasks.Computer;

public class SecondComputer extends Computer {
	int ram;
	String name;
	double cpuFrequencyInGHz;

	public SecondComputer(int ram, String name, double cpuFrequencyInGHz) {
		super();
		this.ram = ram;
		this.name = name;
		this.cpuFrequencyInGHz = cpuFrequencyInGHz;
	}

	@Override
	public void print() {
		System.out.println(
				"SecondComputer has ram = " + ram + " GB" + ";Name= " + name + " and " + "GHz=" + cpuFrequencyInGHz);
	}

}
