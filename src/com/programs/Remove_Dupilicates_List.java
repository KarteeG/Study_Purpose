package com.programs;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Dupilicates_List {
	
	public static void main(String[] args) {
		
		   List<Integer> numbers = Arrays.asList(1,2,2,2,3,5);

	        System.out.println(numbers);

	        Set<Integer> hashSet = new LinkedHashSet<>(numbers);
	        ArrayList<Integer> removedDuplicates = new ArrayList(hashSet);

	        System.out.println(removedDuplicates);
	    }

	}


