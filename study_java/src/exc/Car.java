package exc;

public class Car {
	String company ="현대자동차";
	String model ="그랜다이져";
	String color ="화이트";
	int maxSpeed = 300;
	int speed = 0;
	
	
	void check(){
		if(maxSpeed>=speed) 
			System.out.println("최고속력보다 느립니다");
		else
			System.out.println("최고속력보다 빠릅니다.");
	}
}
