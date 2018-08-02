package Hari;

import java.util.Scanner;

public class Roundoff {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		double b=Math.ceil(a);
		int c=(int)b;
		System.out.println(c);
		
		
	}
}
