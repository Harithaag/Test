package Hari;

import java.util.Scanner;

public class Prime_not {
	public static void main (String s[]){
		int i=0,n;
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		if(n==0||n==1){
			System.out.println("No");
		}else{
		for(int j=2;j<n;j++){
		if(n%j==0){
			i++;
		break;
		}}
		if(i==0){
			System.out.println("Yes");
		}
			else{
				System.out.println("No");
			}
		}
		
	}

}
