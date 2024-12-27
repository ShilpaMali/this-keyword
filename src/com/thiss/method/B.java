package com.thiss.method;
//sub class
public class B extends A{
	void getData() {
		System.out.println("Class B- getData() method");
	}

	void getTest() {
		this.getData(); // calling current class method
	}

}
