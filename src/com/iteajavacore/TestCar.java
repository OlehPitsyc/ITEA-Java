package com.iteajavacore;

public class TestCar {

	public static void main(String[] args) {

		Car polo = new Car("Polo");
		Car mini = new Car("Mini");
		Car beetle = new Car("Beetle");

		System.out.println(Car.rate);
		
		System.out.println(polo.modelName + polo.price);

		Car autoSalon[] = { polo, mini, beetle };
		for (Car auto : autoSalon) {
			System.out.println(auto);
		}
	}

}
