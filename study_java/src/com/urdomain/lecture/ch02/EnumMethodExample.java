package com.urdomain.lecture.ch02;

import java.util.Calendar;

public class EnumMethodExample {

	public static void main(String[] args) {
//		Week abc = Week.MONDAY;
//		Week def = Week.SUNDAY;
//		
//		System.out.println(abc);
//		System.out.println(def);
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDENSDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		System.out.println("���� ����" + today);
		
		if(today == Week.SUNDAY)
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		else
			System.out.println("������ �ڹ� �����մϴ�.");
		
		
		int i = Week.val
	}

}
