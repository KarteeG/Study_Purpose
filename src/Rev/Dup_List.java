package Rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dup_List {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,1,5,6,6));
		
		Set<Integer> s = new HashSet<>(list);
		ArrayList<Integer> a = new ArrayList<>(s);
		System.out.println(a);
	}

}
