package com.urdomain.lecture.ch02;

public class Solve2 {

	public static void main(String[] args) {
		int dice1 = (int)(Math.random() * 6 + 1);
		int dice2 = (int)(Math.random() * 6 + 1);
		int result = dice1 + dice2;
		System.out.println("μ²? λ²μ§Έ μ£Όμ¬?? κ°μ?:" + dice1 + "???€");
		System.out.println("μ²? λ²μ§Έ μ£Όμ¬?? κ°μ?:" + dice2 + "???€");
		System.out.println("? ?? ?©??" + result + "???€");

	}

}
