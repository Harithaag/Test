package Hari;

import java.util.Scanner;

public class Change_odd_even {
	public static void main (String s[]){
		int i,j;
		char t;
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		char a[]=str.toCharArray();
		for(i=0;i<a.length;i++){
			if(i%2!=0){
				//j=i;
				t=a[i];
				a[i]=a[i-1];
				a[i-1]=t;
			}
		}
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		}
		}