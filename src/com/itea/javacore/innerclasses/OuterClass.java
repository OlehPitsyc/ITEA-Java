package com.itea.javacore.innerclasses;

public class OuterClass {
	public void hello(){
		System.out.println("OuterClass hello()");
	}
	
	public InnerClass getInner(){
		return new InnerClass();
	}
	
	protected class InnerClass{
		public void hello(){
			System.out.println("InnerClass hello()");
			OuterClass.this.hello();
		}
		
		public OuterClass getOuter(){
			return OuterClass.this;
		}
	}
}
/*
 * Створили декілька внутрішніх класів, і за допомогою декількох this передавали
 * контсруктору, до якого саме класу звертатись.
 */
