package Hari;

import java.util.Scanner;

public class Odd_two_interval {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++){
			
				
			
			if(i!=1&&i%2==1)
				System.out.println(i);
		}
	}

}
