package com.urdomain.lecture.ch02;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		System.out.println("intValue:" + intValue);
		char charValue = (char) intValue;
		
		double doubleValue = intValue;
		float floatValue = intValue;
		
		
		intValue = (int)doubleValue;
		char charValue1 ='ê°?';
		int integerValue = charValue1;
		long longValue = 23040;
		float floatV = longValue;
		
	}

}
