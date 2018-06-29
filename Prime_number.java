package Hari;

import java.util.Scanner;

public class Prime_number{

public static void main (String s[]){
	int i=0,n;
	Scanner sc = new Scanner(System.in);
	System.out.println("num");
	n=sc.nextInt();
	for(int j=2;j<n;j++){
	if(n%j==0){
		i=1;
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
