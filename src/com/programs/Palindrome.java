package com.programs;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println("Enter The Number");
		Scanner s = new Scanner (System.in);
		
		int d = s.nextInt();
		int a,b,c=0;
		
		a=d;
		while(a>0) {
			b=a%10;
			c=(c*10)+b;
			a=a/10;
		}
		if(c==d) {
		System.out.println("Palindrome");
		System.out.println(c);
	}
		else {
			System.out.println("Non");
		}
	}
}

