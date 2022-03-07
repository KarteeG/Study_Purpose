package Re;

import java.util.HashMap;

public class Rpetative_Word {
	
	public static void main(String[] args) {
		
		String s = "I love My india I love My Mother";
		
		String[] all = s.split(" ");
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		for (String word : all) {
			if (hm.get(word) == null) {
				hm.put(word, 1);
			}
			else {
				hm.put(word,hm.get(word)+1);
			}
			
		}
		System.out.println(hm);
	}

}
