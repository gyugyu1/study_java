package com.urdomain.lecture.ch02;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in); 
			String m = sc.next();
			getMenu(m);
	}

	public static void getMenu(String s) {
		String[][] foods = { { "�Ͻ�", "���", "��Ű�߳�", "�쵿" }, 
				{ "���", "���İ�Ƽ", "����", "�ܹ���", },
				{ "�ѽ�", "��������", "��ġ�", "�ع�����", }, 
				{ "�߽�", "������", "¥���", "«��", } };
		int random = (int) (Math.random() * foods[0].length + 1);
		String food="";
		if (foods[0][0] == s)
			food= foods[0][random];
		
		else if (foods[1][0] == s)
			food = foods[1][random];

		else if (foods[2][0] == s)
			food = foods[2][random];

		else
			food = foods[3][random];
		
		System.out.println(food);
		}

	}

