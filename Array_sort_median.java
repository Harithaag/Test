package Hari;

import java.util.Arrays;
import java.util.Scanner;

public class Array_sort_median {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
	//	int t=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			
		}
		
			
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		System.out.println(a[i]);
	System.out.println(a[0+n/2]);
		}

}
