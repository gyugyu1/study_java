package com.urdomain.lecture.ch02;

public class Solve2 {

	public static void main(String[] args) {
		int dice1 = (int)(Math.random() * 6 + 1);
		int dice2 = (int)(Math.random() * 6 + 1);
		int result = dice1 + dice2;
		System.out.println("ì²? ë²ˆì§¸ ì£¼ì‚¬?œ„?˜ ê°’ì?:" + dice1 + "?…?‹ˆ?‹¤");
		System.out.println("ì²? ë²ˆì§¸ ì£¼ì‚¬?œ„?˜ ê°’ì?:" + dice2 + "?…?‹ˆ?‹¤");
		System.out.println("?‘ ?ˆ˜?˜ ?•©??" + result + "?…?‹ˆ?‹¤");

	}

}
