package Hari;

import java.util.Scanner;

public class Sum_of_digit {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0,su=0;
		int a=n;
		while(a!=0){
			r=a%10;
			a=a/10;
			su+=r;
		}System.out.println(su);
	}

}
