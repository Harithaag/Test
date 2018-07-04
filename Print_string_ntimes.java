package Hari;

import java.util.Scanner;

public class Print_string_ntimes {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			System.out.println(str);
		}
	}

}
