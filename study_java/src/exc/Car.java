package exc;

public class Car {
	String company ="�����ڵ���";
	String model ="�׷�������";
	String color ="ȭ��Ʈ";
	int maxSpeed = 300;
	int speed = 0;
	
	
	void check(){
		if(maxSpeed>=speed) 
			System.out.println("�ְ�ӷº��� �����ϴ�");
		else
			System.out.println("�ְ�ӷº��� �����ϴ�.");
	}
}
