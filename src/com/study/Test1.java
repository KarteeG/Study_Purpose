package com.study;

public class Test1 {
	
	public static void main(String[] args) {
		
		String s = null;
//		System.out.println(s.indexOf(2));
		
		try {
			System.out.println(s.indexOf(2));
		} catch (Exception e) {
			System.out.println("Exception Catched");
			e.printStackTrace();
		}
		System.out.println("Run");
	}
	
}
