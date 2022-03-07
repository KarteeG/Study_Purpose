package Stu;

public class Replace {
	
	
	public static void main(String[] args) {
		
		String s = "12kar2/*thick";
		
		String replaceAll = s.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(replaceAll);
	}

}
