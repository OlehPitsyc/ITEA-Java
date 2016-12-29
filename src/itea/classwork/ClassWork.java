package itea.classwork;

import java.util.Arrays;
import java.util.Scanner;

public class ClassWork {

	public static void main(String[] args) {

		int myArray[] = new int[args.length];

		for (int i = 0; i < args.length; i++) {
			myArray[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(myArray);
		for (int element : myArray)
			System.out.println(element);

		/*
		 * Scanner in = new Scanner(System.in); String myStr = in.next();
		 * System.out.println("Ви ввели: " + myStr); in.close();
		 */
//		Integer myInt = 2;
//		String myStr = myInt.toString();
//		System.out.println(myStr);
	}

	// тут треба юзари обєкти типу сканер і його методт
}
