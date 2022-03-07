package Rev;

import java.util.HashMap;

public class Rep_Word {
	
	
	public static void main(String[] args) {
		
		String s = "i love my india i love my mother";
		String[] allWord = s.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String word : allWord) {
			if (hm.get(word) == null) {
				hm.put(word, 1);
			}
			else {
				hm.put(word, hm.get(word)+1);
			}
			
		}
		System.out.println(hm);
		
	}

}
