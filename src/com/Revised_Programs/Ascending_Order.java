package com.Revised_Programs;

public class Ascending_Order {

	public static void main(String[] args) {
		
		int temp = 0;
		int a[] = new int[] { 10, 9, 8, 7, 6, 5 };

		System.out.println("Original Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorting:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}

	}

}