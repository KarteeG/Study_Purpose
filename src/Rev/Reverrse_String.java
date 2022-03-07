package Rev;

public class Reverrse_String {
	
	
	public static void main(String[] args) {
		
		String s = "Reverse";
		String temp = " ";
		int len = s.length();
		
		for (int i=len-1; i>=0; i--) {
			temp=temp+s.charAt(i);
			
		}
		System.out.println(temp);
		
	}

}
