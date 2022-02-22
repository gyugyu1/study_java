package com.gyu.lecture.ch02;

public class Solve4 {

	public static void main(String[] args) {
		int[] a = new int[] {2,3,4,5,6,7,8,9};
		int [] b = new int[] {1,2,3,4,5,6,7,8,9};
		int result =0;
		for(int i=0;i<a.length;i++) {
			System.out.println();
			for(int j=0; j<b.length;j++) {
				result = a[i]*b[j];
				System.out.print(a[i] + "*" + b[j] + "=" + result + "\t");
			}
		}

	}

}
