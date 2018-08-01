package Hari;

import java.util.Scanner;

public class Prime_num_bwt_range {
	public static void main(String s[]){
		int f=0;
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
	//	String s1="";
		int c=0;
		for(int j=a;j<=b;j++){
			f=0;
		for(int i=2;i<j;i++){
			if(j%i==0){
				f=1;
				break;	
				}}
			if(f==0){
				c++;
			//System.out.println(j);
				
			//	String s1=" "+j;
			//	System.out.println(s1.length());
		
		}
		
	}	System.out.println(c);
}}

