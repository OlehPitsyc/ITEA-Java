package itea78910tasks;

public class Computer {
	static int RAM = 16;
	static String name = "Apple";
	static double weight = 2.2;
	static String cpuBrand = "Intel Core";
	static double cpuFrequencyInGHz = 1.7;

	public Computer() {
	}

	
	@Override
	public String toString() {
		return null;
	}

	public void switchOn() {
		System.out.println("Computer is switch on");
	}

	public void switchOff() {
		System.out.println("Computer is switch off");
	}

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.switchOn();
		computer.switchOff();
		System.out.println("CPU of the computer = " + computer.cpuBrand);
		System.out.println(Integer.toString(RAM) + " MB RAM it too much forthis computer");
		System.out.println("Weight of this computer = " + Double.toString(weight) + " kg");
		System.out.println("The power of this computer = " + Double.toString(cpuFrequencyInGHz) + " GHz");
		

	}
}
