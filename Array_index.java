package Hari;

import java.util.Scanner;

public class Array_index {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.println(a[i]+" "+i);
		}
	}

}
