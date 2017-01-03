package itea78910tasks;

public class Calculator {
	static int firstNumber;
	static int secondNumber;

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int getSum() {
		return firstNumber + secondNumber;

	}

	public void printResult() {
		System.out.println("Sum of two numbers is " + getSum());
	}

	public double sqrtOf() {
		return Math.sqrt(getSum());

	}

	public double sinOf() {
		return Math.sin(getSum());
	}

	public void resultSqrtOF() {
		System.out.println("Sqrt of two numbers is " + sqrtOf());
	}

	public void resultSinOf() {
		System.out.println("Sinus of two numbers is " + sinOf());
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setFirstNumber(15);
		calc.setSecondNumber(10);
		calc.printResult();
		calc.resultSqrtOF();
		calc.resultSinOf();
	}

}
