package com.Revised_Programs;


import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class Dupilicates_List {
	
	public static void main (String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,2,3,3,2,5,5));
		System.out.println("Original With Dupilicates:"+ list);
		
		
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
		System.out.println("Remove Dupulicates:"+newList);
	}

}
