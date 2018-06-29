package Hari;

import java.util.Scanner;

public class Armstrong_two_interval {

	public static void main (String s[]){
		int r,su=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		for(int i=n;i<k;i++){
			int a=i;
			//System.out.println(a);
		
	while(a!=0){
	    r=a%10;
		a=a/10;
		su+=r*r*r;
				}
		if(su==i)
		System.out.println(su);
			
su=0;
		}	}
}