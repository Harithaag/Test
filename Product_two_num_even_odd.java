package Hari;

import java.util.Scanner;

public class Product_two_num_even_odd {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=n*m;
		if(k%2==0)
			System.out.println("even");
			else
		
		System.out.println("odd");
	}

}
