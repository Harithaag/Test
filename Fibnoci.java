package Hari;

import java.util.Scanner;

public class Fibnoci {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		int c=0;
		System.out.println(b);
		for(int i=1;i<=n-1;i++){
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
		}
	}

}
