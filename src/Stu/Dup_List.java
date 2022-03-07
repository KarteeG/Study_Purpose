package Stu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dup_List {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,3,2,1));
		
		Set<Integer> s = new HashSet<Integer>(list);
		
		ArrayList<Integer> a = new ArrayList<Integer>(s);
		
		System.out.println(a);
	}

}
