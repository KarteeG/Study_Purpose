package com.study;

import java.util.Scanner;

public class Switch_Con {
	
	public static void main(String[] args) {
		
		System.out.println("Enter The Number");
		Scanner s = new Scanner(System.in);
		int marks = s.nextInt();
		
		switch(marks) {
		case 80:
		System.out.println("First");
		break;
		case 50:
		System.out.println("Second");
		break;
		default:
			System.out.println("It Is Default ");
		
		}s.close();

}
}