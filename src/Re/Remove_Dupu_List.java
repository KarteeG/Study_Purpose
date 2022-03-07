package Re;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_Dupu_List {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,1,2,2,3,3);
		
		Set<Integer> st = new HashSet<>(list);
		ArrayList<Integer> av = new ArrayList<>(st);
		
		System.out.println(av);
	}

}
