package com.itea.javacore.innerclasses;

public class MyNestedSuperClass {	
	
	private int age = 22;
	
		
	/*public MyInnerClass myMethod(){
		class MyInnerClass {			
			private int age = 22;			
		}
		return new MyInnerClass();
	}*/
	
}
/*
 * У внутрішньому статтичному класі, створил в методі спочатку статичний клас
 * MyInnerClass, в мали достуа до полів зовнішнього класу. А потім змінили
 * внутрішній статичний на внутрішній не статичний клас, теж саме зробили із
 * змінною.
 */