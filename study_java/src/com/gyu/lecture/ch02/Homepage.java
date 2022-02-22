package com.gyu.lecture.ch02;

public class Homepage {

	public static void main(String[] args) {
		Signin sig = new Signin();
			sig.log("sadasd","asdasd");
		
	}

}



class Signin {
	String id;
	String password;
	public void log(String id,String password) {
		this.id = id;
		this.password = password;
	};
}
