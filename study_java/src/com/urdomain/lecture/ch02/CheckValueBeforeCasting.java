package com.urdomain.lecture.ch02;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		
		int i = 127;
		
		if((i<Byte.MIN_VALUE||i>Byte.MAX_VALUE)) {
			System.out.println("값을 ?��?�� ?��?��?��주세?��");
		} else {
			byte b = (byte) i;
			System.out.println(b);
			System.out.println("?��?��?��?���? 캐스?��?��?��?��?��?��.");
		}

	}

	
}
