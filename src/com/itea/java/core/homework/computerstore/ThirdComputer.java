package com.itea.java.core.homework.computerstore;

import itea78910tasks.Computer;

public class ThirdComputer extends Computer {
	int ram;
	String name;
	double cpuFrequencyInGHz;

	public ThirdComputer(int ram, String name, double cpuFrequencyInGHz) {
		super();
		this.ram = ram;
		this.name = name;
		this.cpuFrequencyInGHz = cpuFrequencyInGHz;
	}

	@Override
	public void print() {
		System.out.println(
				"ThirdComputer has ram = " + ram + " GB" + ";Name= " + name + " and " + "GHz=" + cpuFrequencyInGHz);
	}
}
