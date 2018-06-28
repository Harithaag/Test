package Hari;

import java.util.Scanner;

public class Sum_numarray {
	public static void main(String s[]){
		int r=0;
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.print(i);
			
		}System.out.println();
			for(int j=1;j<=k;j++)
			r+=j;
		System.out.println(r);
	}

}
