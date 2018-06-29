package Hari;

import java.util.Scanner;

public class Prime_two_interval {
	public static void main (String s[]){
		int i=0;
		Scanner sc = new Scanner(System.in);
		//System.out.println("num");
		//n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int k=a;k<b;k++){
			i=0;
		for(int j=2;j<k;j++){
		if(k%j==0){
			i=1;
		break;
		}}
		if(i==0)
			System.out.println(k);
		}

	}
}
