package com.itea.javacore.zoo.Audit;

public class ZooAudit {
	public static void main(String[] args) {
		Monkey monkey = new Monkey("Apoo", 1, 2);
		Monkey monkeyBest = new Monkey("Apu", 2, 2);
		Elephant elephant = new Elephant("Slonuk", 2, 5);
		Baboon monkeyBaboon = new Baboon("Tolik", 1, 1);
		IndianElephant indianElephant = new IndianElephant("Rasha", 4, 4);
		BlueMonkey blueMonkey = new BlueMonkey("Gosha", 2, 2);
		Animal[] animals = { monkey, monkeyBest, elephant, indianElephant, monkeyBaboon, blueMonkey };

		for (Animal animal : animals) {
			animal.print();
			System.out.println("My hight is " + animal.getHight() + " and My width is " + animal.getWidth());
			animal.resultAviarySize();
		}
		// for (Animal animal : animals) {
		// if (animal instanceof Monkey) {
		// Monkey myMonkey = (Monkey) animal;
		// myMonkey.print();
		// }
		// if (animal instanceof Elephant) {
		// Elephant myElephant = (Elephant) animal;
		// myElephant.print();
		//
		// }
	}

}
