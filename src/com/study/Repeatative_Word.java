package com.study;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;

public class Repeatative_Word {
	
	public static void main(String[] args) {
		
		String s = "I Love My India and I Love My Mom Love";
		
		String[] split = s.split(" ");
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		for (String word : split) {
			if (m.get(word) == null) {
				m.put(word, 1);
			}else {
				m.put(word, m.get(word)+1);
			}
			
		}
		System.out.println(m);
	}

}
