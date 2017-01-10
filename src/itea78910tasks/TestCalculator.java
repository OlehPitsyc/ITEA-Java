package itea78910tasks;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator(15, 10);
		calc.setFirstNumber(15);
		calc.setSecondNumber(10);
		calc.printResult();
		calc.resultSqrtOF();
		calc.resultSinOf();
	}
}
