package Hari;

import java.util.Scanner;

public class Min_num {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int min=0;
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();}
		min=a[0];
		for(int i=0;i<10;i++){
			
			if(min>a[i])
				min=a[i];
		}System.out.println(min);
	}

}
