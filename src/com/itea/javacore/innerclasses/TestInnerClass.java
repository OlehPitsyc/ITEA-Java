package com.itea.javacore.innerclasses;

public class TestInnerClass {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass objInnerClass = outerClass.getInner();
		objInnerClass.hello();
	}
	/*
	 * ��������� ����� ���� OuterClass, ������������� �����������. ��
	 * ��������� �������� �����, ������� ���� ����������� ����� � ���������
	 * ���� �����. ������� ����� ��������� ���� ��������� ������ ��������
	 * �����
	 */

}
