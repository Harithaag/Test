package Hari;

import java.util.Scanner;

public class Larger_num {
public static void main(String s[]){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a>b||a>c){
		System.out.println(a);
		}
	else if(b>c||a>b){
		System.out.println(b);
		
	}else
	{
		System.out.println(c);
	}
		
	
}
}
