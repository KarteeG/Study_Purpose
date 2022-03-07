package Stu;


public class Rep_Each_Word {

	public static void main(String[] args) {

		String s = "Welcome to Java";
		String[] words = s.split(" ");
		String rs = " ";

		for (String w : words) {
			String rw = " ";
			for (int i = w.length() - 1; i >= 0; i--) {
				rw = rw + w.charAt(i);
			}
			rs = rs + rw + " ";

		}
		System.out.println(rs);

	}
}