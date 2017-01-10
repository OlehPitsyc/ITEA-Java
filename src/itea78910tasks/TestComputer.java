package itea78910tasks;

public class TestComputer {

	static private Calculator calc;

	public static void main(String[] args) {
		Computer myComp = new Computer();
		// Calculator calc = new Calculator(5, 5);
		// myComp.setName("HP");
		// myComp.setRam(24);
		// myComp.setCpuBrand("Intel Core");
		// myComp.setWeight(2.0);
		// myComp.setCpuFrequencyInGHz(2.7);
		// System.out.println(myComp.getName());
		// System.out.println(myComp.getRam());
		// System.out.println(myComp.getCpuBrand());
		// System.out.println(myComp.getCpuFrequencyInGHz());
		// System.out.println(myComp.getWeight());
		myComp.switchOff();
		myComp.switchOn();
		myComp.instalOS();
		myComp.startOS();
		calc = myComp.instalCalculator(255, 10);
		calc.printResult();
		calc.resultSqrtOF();
		calc.resultSinOf();
	}
}
