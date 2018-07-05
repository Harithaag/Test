package Hari;

import java.util.Scanner;

public class Reverse_num {
	public static void main(String s[]){
		int f=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		for(int i=0;i<sb.length();i++){
			if(Character.isDigit(sb.charAt(i)))
				f++;
		}
		System.out.println(sb.reverse());

	}
}
