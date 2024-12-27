package com.thiss.variable;

public class B extends A {
	int x = 20;

	void getData() {

		int x = 30;
		// scenario-1
		B b=new B();
		System.out.println("using object>>" + b.x);
		/*for single variable, we are loading entire 
		 * class into memory, bad approach 
		 */
		// scenario-2
		System.out.println("Using this keyword>>"+this.x);
		/*
		 * I am using super keyword so no need to load
		 * class into memory, good approach
		 */
	}

}
