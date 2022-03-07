package com.study;

public class Test {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		try {
			System.out.println(a/0);
		} catch (ArithmeticException e) {
			System.out.println("Exception Catched");
			e.printStackTrace();
		}
		
		
	}

}
