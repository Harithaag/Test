package Hari;

import java.util.Scanner;

public class Arithmetic_progression {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int d=sc.nextInt();
		int s1=0;
		for(int i=1;i<=n;i++){
		s1=s1+a;
		a=a+d;
			
		}System.out.println(s1);
	}

}
