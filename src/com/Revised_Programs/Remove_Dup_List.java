package com.Revised_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_Dup_List {
	
	public static void main(String[] args) {
		
		
		List num = Arrays.asList(1,1,2,3,4,5,6,6);
		System.out.println(num);
		
		
		Set<Integer> ht = new HashSet<>(num);
		ArrayList<Integer> rd = new ArrayList<>(ht);
		System.out.println(rd);
	}
}
