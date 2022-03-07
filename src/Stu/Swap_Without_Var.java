package Stu;

public class Swap_Without_Var {
	
	public static void main(String[] args) {
		
		int x =  200;
		int y = 100;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("x"+x);
		System.out.println("Y"+y);
	}

}
