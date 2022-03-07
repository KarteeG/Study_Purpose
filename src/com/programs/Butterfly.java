package com.programs;

public class Butterfly {
	
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8,9,10};
		
		int length = a.length/2;
		
		for (int i = length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
		for (int i = a.length-1; i>=length; i--) {
			System.out.println(a[i]);
		}
		
	}

}
