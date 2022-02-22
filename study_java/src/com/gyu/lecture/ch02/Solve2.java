package com.gyu.lecture.ch02;

public class Solve2 {

	public static void main(String[] args) {
		int dice1 = (int)(Math.random() * 6 + 1);
		int dice2 = (int)(Math.random() * 6 + 1);
		int result = dice1 + dice2;
		System.out.println("첫 번째 주사위의 값은:" + dice1 + "입니다");
		System.out.println("첫 번째 주사위의 값은:" + dice2 + "입니다");
		System.out.println("두 수의 합은" + result + "입니다");

	}

}
