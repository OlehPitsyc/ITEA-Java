package itea.firstclass.homework;

public class FirstHomeWork {

	String name;
	byte guarantee;
	short age;
	int memory;
	long serialNumber;
	float weightOfComputer;
	double sizeOfScreen;
	boolean isComputerNew;

	char partNumber;

	public static void main(String[] args) {
		FirstHomeWork computer = new FirstHomeWork();
		computer.name = "Apple";
		computer.age = 1;
		computer.memory = 500;
		computer.serialNumber = 84657548;
		computer.guarantee = 4;
		computer.weightOfComputer = 2.5f;
		computer.sizeOfScreen = 15.6;
		computer.isComputerNew = false;
		computer.partNumber = 'P';
		
		System.out.println("Is this computer new : " + computer.isComputerNew);
		System.out.println("Age of computer: " + computer.age + " year");
		System.out.println("Computer memory: " + computer.memory + " GB");
		System.out.println("Name of computer: " + computer.name);
		System.out.println("Serial number: " + computer.serialNumber);
		System.out.println("Guarantee for: " + computer.guarantee + " years");
		System.out.println("Weight Of computer: " + computer.weightOfComputer + " kg");
		System.out.println("Size of screen: " + computer.sizeOfScreen + " inches");
		System.out.println("Part number of this computer: " + computer.partNumber);

	}

}
