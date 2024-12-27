package com.thiss.keyword;

public class Constructor {
	public Constructor() {
		System.out.println("This is constructor without parameter");
	}
	
	public Constructor(int a) { //a contain 25
		this(); //calling current class constructor
		//System.out.println(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor constructor = new Constructor(25);

	}

}
