package com.itea.javacore.innerclasses;

public class OuterWithLocalClass{
	private int count = 0;
	
	Counter getCounter(final String name){
		
		return new Counter() {
			
			@Override
			public int next() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
}
/*��������� ��������� ����. 
 * �� ���� �������� ��� ��� �������� ����������� ���������� OuterWithAnonymousClass */
