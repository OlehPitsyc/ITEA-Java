package com.itea.javacore.innerclasses;

public class TestOuterWithLocalClass{

	public static void main(String[] args) {
		OuterWithLocalClass oWithLocalClass = new OuterWithLocalClass();
		Counter objectLocalClass = oWithLocalClass.getCounter("test");
		objectLocalClass.next();
	}
}

