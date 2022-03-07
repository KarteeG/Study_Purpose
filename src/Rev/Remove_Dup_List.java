package Rev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Dup_List {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,1,2,2,3,3);
		
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(newList);
	}

}
