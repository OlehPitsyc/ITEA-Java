package com.itea.javacore.innerclasses;

public class TestOuterWithAnonymousClass {

	public static void main(String[] args) {
		OuterWithAnonymousClass oWithLocalClass = new OuterWithAnonymousClass();
		Counter objectAnonymousInner = oWithLocalClass.getCounter("test");
		objectAnonymousInner.next();

	}
	/*
	 * ��������� ����� ���� OuterClass, ������������� �����������. ��
	 * ��������� �������� �����, ������� ���� ���������� ����� � ���������
	 * ���� �����.
	 */

}
