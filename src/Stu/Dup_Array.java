package Stu;

public class Dup_Array {
	
	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3,3,2,1};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
		
	}

}
