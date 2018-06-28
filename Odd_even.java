package Hari;

import java.util.Scanner;

public class Odd_even {

	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	//	for(int i=1;i<=100000;i++);
		if(n>=1||n<=100000){
			if(n<0){
			System.out.println("invalid");
			}else
			{if(n%2==1){
				System.out.println("Odd");
			}
				else{
					System.out.println("Even");
			}
		}
		
		}
	}
}

