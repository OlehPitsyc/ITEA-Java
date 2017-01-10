package com.itea.javacore.zoo.Audit;

public class Animal {
	private int hight;
	private int width;

	public Animal(int hight, int width) {

		this.hight = hight;
		this.width = width;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Animal [hight=" + hight + ", width=" + width + "]";
	}

	public int aviarySizeCount() {
		return getHight() * getWidth() * 10;

	}

	public void resultAviarySize() {
		System.out.println("Size of my aviary is " + aviarySizeCount());
	}

	public void print() {

	}
}
