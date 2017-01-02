package itea78910tasks;

public class Computer {
	static int RAM = 16;
	static String name = "Apple";
	static double weight = 2.2;
	static String cpuBrand = "Intel Core";
	static double cpuFrequencyInGHz = 1.7;

	public Computer() {
	}

	public Computer(String name, String cpuBrand, double weight, int RAM, double cpuFrequencyInGHz) {
		this.name = name;
		this.cpuBrand = cpuBrand;
		this.weight = weight;
		this.RAM = RAM;
		this.cpuFrequencyInGHz = cpuFrequencyInGHz;

	}

	@Override
	public String toString() {
		return this.RAM + " " + this.cpuBrand + " " + " " + this.weight + " " + this.name + " "
				+ this.cpuFrequencyInGHz;
	}

	public void switchOn() {
		System.out.println("Computer is switch on");
	}

	public void switchOff() {
		System.out.println("Computer is switch off");
	}

	public static void main(String[] args) {
		Computer computer = new Computer();
		Computer myComp = new Computer("Apple", "1.7 GHz", 2.2, 16, 1.7);
		computer.switchOn();
		computer.switchOff();
		System.out.println("CPU of the computer = " + computer.cpuBrand);
		System.out.println(Integer.toString(RAM) + " MB RAM it too much forthis computer");
		System.out.println("Weight of this computer = " + Double.toString(weight) + " kg");
		System.out.println("The power of this computer = " + Double.toString(cpuFrequencyInGHz) + " GHz");
		System.out.println("Method toString:");
		System.out.println(myComp.toString());

	}
}
