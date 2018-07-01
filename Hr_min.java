package Hari;

import java.util.Scanner;

public class Hr_min {
public static void main(String s[]){
	Scanner sc=new Scanner(System.in);
	int h1=sc.nextInt();
	int m1=sc.nextInt();
	int h2=sc.nextInt();
	
	int m2=sc.nextInt();
	int h=h1-h2;
	int m=m1-m2;
	//int a=Integer.toUnnsignedInt(h);
	System.out.println(Math.abs(h)+" "+Math.abs(m));
}
}
