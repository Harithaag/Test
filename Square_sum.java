package Hari;

import java.util.Scanner;

public class Square_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0,sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		while(a!=0){
			r=a%10;
			a=a/10;
			sum+=r*r;
		}System.out.println(sum);

	}

}
