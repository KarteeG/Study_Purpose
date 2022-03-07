package com.programs;

public class Armstring {
	
	public static void main(String[] args) {
		int a = 153;

		int rem = 0, value = 0;
		int temp = a;

		while (temp>=0) {

			rem = temp % 10;
			value = value + rem * rem * rem;
			temp = temp / 10;
		}
		System.out.println(value);
	}

}
