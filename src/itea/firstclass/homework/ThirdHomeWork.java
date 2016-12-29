package itea.firstclass.homework;

public class ThirdHomeWork {

	double inputNamber = 25;
	
	public double sqrtOfNumber(double number) {
		double squareRootOfNumber = Math.sqrt(number);
		return squareRootOfNumber;
	}

	public double sinusOfNumber(double sinusNamber) {
		double sinNumber = Math.sin(sinusNamber);
		return sinNumber;
	}

	public static void main(String[] args) {
		ThirdHomeWork number = new ThirdHomeWork();
		double resultSqrtOfNumber = number.sqrtOfNumber(number.inputNamber);
		System.out.println(resultSqrtOfNumber);
		double resultSinusOfNumber = number.sinusOfNumber(number.inputNamber);
		System.out.println(resultSinusOfNumber);

	}
}
