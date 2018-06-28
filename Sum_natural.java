package Hari;

import java.util.Scanner;

public class Sum_natural {
	public static  void main(String s[]){
		int r=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			r+=i;
			
		}
		System.out.println(r);
	}

}
