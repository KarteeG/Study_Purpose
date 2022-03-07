package com.test;

public class B extends A{
	
	@Override
	public void method1() {
		System.out.println("Child Class");
	}
	
	public static void main(String[] args) {
		 B b = new B();
		 b.method1();
		 
		 A a = new A();
		 a.method1();
		 
		 A a1= new B();
		 a1.method1();
		
	}

}
