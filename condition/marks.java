package com.terrinery.condition;

import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
	
//		int a = 50;
//		int b = 40;
//		String result;String results;
//		
//		
//		results = a>=50 ? "First Class":"Second Class";
//		result = b>=50 ? "First Class":"Second Class";
//		
//		System.out.println(result);
//		System.out.println(results);
		
		System.out.println("Enter The Marks");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String Results;
		
		Results = a>=80 ? "First Class" : a>40 && a<80 ? "Second":"third";
		System.out.println(Results);
		
		
	
}
}