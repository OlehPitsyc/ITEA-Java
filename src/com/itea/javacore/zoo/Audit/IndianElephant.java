package com.itea.javacore.zoo.Audit;

public class IndianElephant extends Elephant {

	public IndianElephant(String name, int hight, int width) {
		super(name, hight, width);

	}

	@Override
	public int aviarySizeCount() {
		return getHight() * getWidth() * 20;

	}
}
