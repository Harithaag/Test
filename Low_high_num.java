package Hari;

import java.util.Scanner;

public class Low_high_num {
	public static void main(String s[]){
		int max,min;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			
		}
		
		max=a[0];
		min=a[0];
		for(int i=0;i<n;i++){
			
		
		if(max<a[i]){
			max=a[i];
			
		}if(min>a[i]){
			min=a[i];
		}
		
		}System.out.println(max);
		System.out.println(min);
		
	}


}
