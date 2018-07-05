package Hari;

import java.util.Scanner;

public class Appened_dot {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		char c='.';
		System.out.println(sb.append(c));
	}

}
