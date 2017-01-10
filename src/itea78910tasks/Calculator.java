package itea78910tasks;

public class Calculator {
	int firstNumber;
	int secondNumber;

	public Calculator(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

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

}
