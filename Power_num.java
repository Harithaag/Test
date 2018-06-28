package Hari;

import java.util.Scanner;

public class Power_num {
	public static void main(String s[]){
		int r=1;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=1;i<=b;i++){
			r*=a;
			
		}System.out.println(r);
		}

}
