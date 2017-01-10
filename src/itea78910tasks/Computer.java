package itea78910tasks;

public class Computer {
	private int ram;
	private String name;
	private double weight;
	private String cpuBrand;
	private double cpuFrequencyInGHz;

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getCpuBrand() {
		return cpuBrand;
	}

	public void setCpuBrand(String cpuBrand) {
		this.cpuBrand = cpuBrand;
	}

	public double getCpuFrequencyInGHz() {
		return cpuFrequencyInGHz;
	}

	public void setCpuFrequencyInGHz(double cpuFrequencyInGHz) {
		this.cpuFrequencyInGHz = cpuFrequencyInGHz;
	}

	public void switchOn() {
		System.out.println("Computer is switch on");
	}

	public void switchOff() {
		System.out.println("Computer is switch off");
	}

	public void instalOS() {
		System.out.println("New OS is instal");
	}

	public void startOS() {
		System.out.println("OS is starting");
	}

	public Calculator instalCalculator(int firstNumber, int secondNumber) {
		return new Calculator(firstNumber, secondNumber);
	}
}
