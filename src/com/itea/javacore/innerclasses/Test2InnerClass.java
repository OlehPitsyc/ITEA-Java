package com.itea.javacore.innerclasses;

public class Test2InnerClass {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass objInnerClass = outerClass.new InnerClass();
		objInnerClass.hello();
	}
}
/*
 * ��������� ����� ���� OuterClass, ������������� �����������. �� ���������
 * �������� �����, ������� ���� ����������� ����� � ��������� ����
 * ������������ ����� ��������� ���� ��������� ������ �������� �����
 */
