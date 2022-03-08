package com.urdomain.lecture.ch02;

public class Test2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		for(int i=0;i<6;i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			for(int j=0;j<i;j++)
				if(lotto[i]==lotto[j]) {
				i--;
				break;
			}
		}
		for(int n : lotto) {
			System.out.print(n + " ");
		}
	}

}
