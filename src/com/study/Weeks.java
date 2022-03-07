package com.study;

import java.util.Scanner;

public class Weeks {
	
	public static void main(String[] args) {
		
		System.out.println("Enter The Number");
		Scanner s= new Scanner(System.in);
		int weeks = s.nextInt();
		
		switch(weeks) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		default:
			System.out.println("Non Of these");
		}
		s.close();
	}

}
