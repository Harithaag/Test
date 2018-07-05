package Hari;

import java.util.Scanner;

public class Reverse_string {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		System.out.println(sb.reverse());
	}

	

}
