package Hari;

import java.util.Scanner;

public class Numeric_character {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int f=0;
		for(int i=0;i<str.length();i++)
		{
	//if(str.charAt(i))
			if(Character.isDigit(str.charAt(i))){
				f++;
			}
		}
		System.out.println(f);
	}

}
