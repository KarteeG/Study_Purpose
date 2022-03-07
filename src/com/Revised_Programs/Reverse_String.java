package com.Revised_Programs;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		String s = "Revesre";
		String temp = " ";
		
		int length = s.length();
		for (int i = length-1; i>0; i--) {
			temp=temp+s.charAt(i);
		}
		System.out.println(temp);
	}

}
