package com.itea.javacore.innerclasses;

public class OuterWithAnonymousClass {
	private int count = 0;

	Counter getCounter(final String name) {

		return new Counter() {

			{
				System.out.println("LocalCounter Constructor");
			}

			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		};
	}
}

/*
 * Стоврили анонімний клас, тим самим скоротили кількість коду.IDEA може сама
 * генерувати анонімний клас. В анонімному класі імлементується інтерфейс
 * Counter і відповідно до нього переопридляємо метод next і передаємо константу
 * змінну типу стрінг
 */