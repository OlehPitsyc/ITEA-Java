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
 * �������� �������� ����, ��� ����� ��������� ������� ����.IDEA ���� ����
 * ���������� �������� ����. � ��������� ���� ������������� ���������
 * Counter � �������� �� ����� �������������� ����� next � �������� ���������
 * ����� ���� �����
 */