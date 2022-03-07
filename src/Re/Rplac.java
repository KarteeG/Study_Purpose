package Re;

public class Rplac {
	
	public static void main(String[] args) {
		
		String s = "123Karthick/98798%$#";
		
		String replaceAll = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replaceAll);
		
		String replaceAll1 = s.replaceAll("[^a-zA-Z]", "");
		System.out.println(replaceAll1);
	}

}
