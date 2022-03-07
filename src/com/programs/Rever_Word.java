package com.programs;

public class Rever_Word {

	public static void main(String[] args) {
		
		String s = "Reverse";
		String temp = " ";
		
		int length = s.length();
		
		for (int i = length-1; i>=0; i--) {
			temp=temp+s.charAt(i);
		}
		
		System.out.println(temp);
		
	}
		

}
