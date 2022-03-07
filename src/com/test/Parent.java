package com.test;

public class Parent {
	
	protected void method1() {
		System.out.println("Protected Method 1");
	}
	
	public Parent() {
			System.out.println("Parent Constructor");
			
	}
	
	static {
		
		System.out.println("Parent Static Block");
		
	}
		private static void static_Method() {
			System.out.println("Static Method");
		}
}