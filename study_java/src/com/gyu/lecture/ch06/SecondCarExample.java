package com.gyu.lecture.ch06;

public class SecondCarExample {

	public static void main(String[] args) {
		SecondCar car1 = new SecondCar();
		System.out.println("company :" + car1.company);
		System.out.println("model :" + car1.model);
		System.out.println("color :" + car1.color);
		System.out.println("maxSpeed :" + car1.maxSpeed);
		System.out.println();
		
		SecondCar car2 = new SecondCar("�ƹݶ�");
		System.out.println("company :" + car2.company);
		System.out.println("model :" + car2.model);
		System.out.println("color :" + car2.color);
		System.out.println("maxSpeed :" + car2.maxSpeed);
		System.out.println();
		
		SecondCar car3 = new SecondCar("�ƹݶ�","����");
		System.out.println("company :" + car3.company);
		System.out.println("model :" + car3.model);
		System.out.println("color :" + car3.color);
		System.out.println("maxSpeed :" + car3.maxSpeed);
		System.out.println();
		
		SecondCar car4 = new SecondCar("�ƹݶ�","����",80);
		System.out.println("company :" + car4.company);
		System.out.println("model :" +car4.model);
		System.out.println("color :" + car4.color);
		System.out.println("maxSpeed :" + car4.maxSpeed);
		System.out.println();
		

	}

}
