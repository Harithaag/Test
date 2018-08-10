package Hari;

import java.util.Scanner;

public class Index_value {

	public static void main(String[] s) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++){
			if(a[i]==i){
				System.out.println(a[i]);
			}
			
		}

	}

}
