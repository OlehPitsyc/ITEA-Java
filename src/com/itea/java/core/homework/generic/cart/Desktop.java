package com.itea.java.core.homework.generic.cart;

import itea78910tasks.Computer;

public class Desktop extends Computer {
	String cpuBrand;
	double cpuFrequencyInGHz;
	// Power Supply:
	String powerSupplyBrand;
	int powerSupplyWattage;
	String hddBrand;
	double hddCapacityInTB;

	public Desktop(String cpuBrand, double cpuFrequencyInGHz, String powerSupplyBrand, int powerSupplyWattage,
			String hddBrand, double hddCapacityInTB) {
		super();
		this.cpuBrand = cpuBrand;
		this.cpuFrequencyInGHz = cpuFrequencyInGHz;
		this.powerSupplyBrand = powerSupplyBrand;
		this.powerSupplyWattage = powerSupplyWattage;
		this.hddBrand = hddBrand;
		this.hddCapacityInTB = hddCapacityInTB;
	}

	@Override
	public String toString() {
		return "Tablet [cpuBrand=" + cpuBrand + ", cpuFrequencyInGHz=" + cpuFrequencyInGHz + ", powerSupplyBrand="
				+ powerSupplyBrand + ", powerSupplyWattage=" + powerSupplyWattage + ", hddBrand=" + hddBrand
				+ ", hddCapacityInTB=" + hddCapacityInTB + "]";
	}

}
