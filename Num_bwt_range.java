package Hari;

import java.util.Scanner;

public class Num_bwt_range {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int f=0;
		for(int i=b+1;i<c;i++){
			if(a==i)
				f++;
		}
		if(f!=0)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
