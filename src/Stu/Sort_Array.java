package Stu;

import java.util.Arrays;

public class Sort_Array {
	
	public static void main(String[] args) {
		
		int [] a = {1,2,5,4,3,10,9,6,7};
		
		Arrays.sort(a);
		
		String string = Arrays.toString(a);
		
		System.out.println(string);
	}

}
