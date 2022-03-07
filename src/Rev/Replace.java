package Rev;

public class Replace {
	
	public static void main(String[] args) {
		
		String s = "12Karthick415%";
		
		String replaceAll = s.replaceAll("[^a-zA-Z]", " ");
		System.out.println(replaceAll);
	}

}
