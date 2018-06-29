package Hari;

import java.util.Scanner;

public class Factorial {
	public static void main(String s[]){
		int f=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			f*=i;
		}System.out.println(f);
		
	}

}
