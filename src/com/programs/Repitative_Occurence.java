package com.programs;

import java.util.HashMap;

public class Repitative_Occurence {
	
	public static void main(String[] args) {

		String s = "I love my india and i love my tamilnadu";
		
		String[] eachWord = s.split(" ");
		
		HashMap<String, Integer> kv = new HashMap<String, Integer>();
		for (String word : eachWord) {
			if (kv.get(word) == null) {
				kv.put(word, 1);
			} else {
				kv.put(word, kv.get(word) + 1);
			}

		}
		System.out.println(kv);
	}

}
