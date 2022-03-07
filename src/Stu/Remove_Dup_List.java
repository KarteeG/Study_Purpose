package Stu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Dup_List {
	
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,2,3,2,3,4,4));
		
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(newList);
	}

}
