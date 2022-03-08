package com.urdomain.lecture.ch02;

import java.util.Scanner;

public class Solve1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int max = 1000;
		int min = -1000;

		String Quadrant= "";
		while(true) {
			System.out.println("ê°’ì„ ?…? ¥?•´ì£¼ì„¸?š”");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
		if(a==0 || b==0 || !(min<=a&&a<=max)||!(min<=b&&b<=max)) {
			System.out.println("?˜ëª»ëœ ê°’ì…?‹ˆ?‹¤");
			continue;
		}
		if(a>0) {
			if(b>0)
				Quadrant = "Quadrant 1";
			else
				Quadrant = "Quadrant 4";
		
		} else { 
			if(b<0)
				Quadrant = "Quadrant 3";
			else
				Quadrant = "Quadrant 2";
		}
		System.out.println(Quadrant);
		
		continue;
		}
		
	}

}
