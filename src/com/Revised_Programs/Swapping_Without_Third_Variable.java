package com.Revised_Programs;

public class Swapping_Without_Third_Variable {
	
	public static void main(String[] args) {
		
		int x=100;
		int y=200;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("X"+x+"   Y"+y);
	}

}
