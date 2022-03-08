package com.urdomain.lecture.ch02;

public class Login {
	String id;
	String password;
	
	
	public void log(String id,String password) {
		this.id = id;
		this.password = password;
	};
}

	public static void main(String[] args) {
		Login l = new Login();
		
		l.log("ldfdf", "dklsdk");
	}
