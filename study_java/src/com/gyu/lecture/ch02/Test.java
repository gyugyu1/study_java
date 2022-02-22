package com.gyu.lecture.ch02;

public class Test {

	public static void main(String[] args) {
		
		int[] score = {83,90, 87,99};
		int sum =0;
		double avg=0;
		for(int i=0; i<4 ; i++) {
			
			sum +=score[i];
		}
		avg= (double)sum/4;
		System.out.println(sum);
		System.out.println(avg);
		
	}

}
