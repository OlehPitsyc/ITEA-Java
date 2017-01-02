package itea78910tasks;

public class Computer {
	private static int RAM;
	private static String name;
	private static double weight;
	private static String cpuBrand;
	private static double cpuFrequencyInGHz;

	public static int getRAM() {
		return RAM;
	}

	public static void setRAM(int rAM) {
		RAM = rAM;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Computer.name = name;
	}

	public static double getWeight() {
		return weight;
	}

	public static void setWeight(double weight) {
		Computer.weight = weight;
	}

	public static String getCpuBrand() {
		return cpuBrand;
	}

	public static void setCpuBrand(String cpuBrand) {
		Computer.cpuBrand = cpuBrand;
	}

	public static double getCpuFrequencyInGHz() {
		return cpuFrequencyInGHz;
	}

	public static void setCpuFrequencyInGHz(double cpuFrequencyInGHz) {
		Computer.cpuFrequencyInGHz = cpuFrequencyInGHz;
	}

	public void switchOn() {
		System.out.println("Computer is switch on");
	}

	public void switchOff() {
		System.out.println("Computer is switch off");
	}

	public static void main(String[] args) {
		Computer myComp = new Computer();
		myComp.setName("HP");
		myComp.setRAM(24);
		myComp.setCpuBrand("Intel Core");
		myComp.setWeight(2.0);
		myComp.setCpuFrequencyInGHz(2.7);
		System.out.println(myComp.getName());
		System.out.println(myComp.getRAM());
		System.out.println(myComp.getCpuBrand());
		System.out.println(myComp.getCpuFrequencyInGHz());
		System.out.println(myComp.getWeight());

	}
}
