package com.gyu.lecture.ch02;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		
		int i = 127;
		
		if((i<Byte.MIN_VALUE||i>Byte.MAX_VALUE)) {
			System.out.println("값을 다시 입력해주세요");
		} else {
			byte b = (byte) i;
			System.out.println(b);
			System.out.println("정상적으로 캐스팅되었습니다.");
		}

	}

	
}
