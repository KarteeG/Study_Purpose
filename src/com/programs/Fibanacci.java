package com.programs;

public class Fibanacci {
	
	public static void main (String [] args){
		int a=0,b=1,c;
		for(int i=0;i<=5;i++){
		if(i<0){
		c=0;
			}
		else{
			c=a+b;
			a=b;
			b=c;

	}
		System.out.println(c);

	}

	}

}
