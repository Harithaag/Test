package Hari;

import java.util.Scanner;

public class Even_two_interval {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<b;i++){
			
				
			
			if(i!=a&&i%2==0)
				System.out.println(i);
		}
	}

}
