package Hari;

import java.util.Scanner;

public class Found_num {

 public static void main(String s[]){
	 int f=0;
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int k=sc.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++){
		 a[i]=sc.nextInt();
	 }f=0;
	 for(int i=0;i<n;i++){
		 if(k==a[i])
			 f++;
		 	 
	 }
	 if(f==0)
		 System.out.println("no");
		 else 
			 System.out.println("yes");
	 }
 }

