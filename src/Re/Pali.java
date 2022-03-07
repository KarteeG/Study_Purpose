package Re;

import java.util.Scanner;

public class Pali {

	public static void main(String[] args) {

		System.out.println("Enter the Number");
		Scanner s = new Scanner(System.in);

		int d = s.nextInt();
		int a, b, c = 0;
		a = d;

		while (a > 0) {
			b = a % 10;
			c = b + (c * 10);
			a = a / 10;
		}
		System.out.println(c);
		if (c == d) {
			System.out.println("Pal");

		}
		else {
			System.out.println("Non Pal");
		}

	}

}
