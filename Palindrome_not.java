package Hari;

import java.util.Scanner;

public class Palindrome_not {
	public static void main(String s[]){
		int r,su=0;
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		sb.append(n);
		String str=sb.reverse().toString();	
		
		if(str.equals(n)){
			System.out.println("Yes");
		}
			else
			{
				System.out.println("No");
		}
			
		
	}

}
