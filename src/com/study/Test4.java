package com.study;

public class Test4 {
	
	public static void main(String[] args) {
		
		
		int a =10;
		synchronized (args) {
			System.out.println(a / 0);
		}
		System.out.println("After Run");
	}

}
