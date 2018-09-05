package Hari;

import java.util.Scanner;

public class Except_repeaded_word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int m=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}m=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i!=j){
			if(a[i]!=a[j]){
				m=1;
			}
			else{
				m=0;
				break;
			}
			
		}}//System.out.println(m);
		if(m==1){
			System.out.println(a[i]);
		}
		
	}
	}

}
