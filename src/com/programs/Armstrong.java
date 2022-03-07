package com.programs;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		
		int a,b,c=0;
		int d = s.nextInt();
		
		a=d;
		while (a>0) {
			b=a%10;
			c=c+(b*b*b);
			a=a/10;
			
			
		}
		System.out.println(c);
		if(c==d) {
			System.out.println("Arms");	
		}
		else {
			System.out.println("Non");
		}
	}
	

	}
	


