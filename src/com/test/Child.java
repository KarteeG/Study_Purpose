package com.test;

public class Child extends Parent {
	
	public Child() {
		System.out.println("Child Constructor");
	}
	
	@Override
	protected void method1() {
		super.method1();
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method1();
		
		Child c = new Child();
		c.method1();
		
		Parent pc = new Child();
		pc.method1();
		
		
	}

}
