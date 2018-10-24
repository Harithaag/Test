package player;

import java.util.Scanner;

public class Isomopic {

	public static void main(String s[]){
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
		String str1=sc.next();
		int f=0,g=0;
		if(str.length()!=str1.length()){
			System.out.println("no");
		}
		else{
			for(int i=0;i<str.length();i++){ 
			 for(int j=i+1;j<str.length();j++){
				 if(str.charAt(i)==str.charAt(j)){
					 f++;
				 }
				 if(str1.charAt(i)==str1.charAt(j)){
					 g++;
				 }
			 }
				
			}
		if(f==g){
			System.out.println("yes");
		}
		else
			System.out.println("No");
		
	}

	}
}
