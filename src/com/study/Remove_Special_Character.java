package com.study;

public class Remove_Special_Character {
	
	public static void main(String[] args) {
		
		String s ="Steven%Smith49";
		
		String text = s.replaceAll("[^a-zA-Z0-9]", " "); //^Except The All Charcters And Numbers
		
		String text1 = s.replaceAll("[^0-9]", " "); //Except Number Only
		
		String trim = text1.trim(); //It will Remove Unwante Spaces
		
		String k = "@Karthick*129";
		String value = k.replaceAll("[^a-zA-z]", " ").trim();
				
		System.out.println(text);
		System.out.println(trim);
		System.out.println(value);
	}

}
