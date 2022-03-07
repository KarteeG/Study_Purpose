package Re;

public class Swap_Without_Thiird_Vari {
	
	public static void main(String[] args) {
		
		int x = 100;
		int y = 200;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("x"+x+"y"+y);
	}

}
