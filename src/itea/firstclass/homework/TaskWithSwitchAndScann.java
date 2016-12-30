package itea.firstclass.homework;

import java.util.Scanner;

public class TaskWithSwitchAndScann {
	public static void main(String[] args) {
		// Please ignore this code
		/*
		 * int numbersArray[] = new int[2];
		 * 
		 * for (int i = 0; i < args.length; i++) { numbersArray[i] =
		 * Integer.parseInt(args[i]); } for (int element : numbersArray) {
		 * System.out.println(element); }
		 */

		Scanner number = new Scanner(System.in);
		double number1 = number.nextInt();
		double number2 = number.nextInt();
		String operant = "*";
		double result;

		switch (operant) {
		case "*":
			result = number1 / number2;

			System.out.println("The result = " + result);
		}

	}
}
