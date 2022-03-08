package test;

public class ComputerExample {

	public static void main(String[] args) {
		int a = 7;
		
		System.out.println("원의 반지름 " + a);
		System.out.println();
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행:" + Calculator.circle(a));
		System.out.println();
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행:" + Computer.circle(a));

	}

}
