package itea.firstclass.homework;

import java.util.Arrays;

public class SecondHomeWork {

	public static int[] createArray(int maxValue, int minValue) {
		int[] Array = new int[10];
		for (int i = 0; i < Array.length; i++) {
			Array[i] = (int) (Math.random() * 20.3);
			System.out.println(Array[i] + " ");
		}
		maxValue = Arrays.stream(Array).max().getAsInt();
		minValue = Arrays.stream(Array).min().getAsInt();
		int values[] = new int[2];
		values[0] = minValue;
		values[1] = maxValue;
		return values;
	}

	public static void printResult(int[] values) {
		System.out.println("The minValue = " + values[0]);
		System.out.println("The maxValue = " + values[1]);

	}

	public static void main(String[] args) {
		int[] result = createArray(0, 0);
		printResult(result);
	}
}
