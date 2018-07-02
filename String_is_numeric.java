package Hari;

import java.util.Scanner;

public class String_is_numeric {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int f=0;
        for(int i=0;i<n.length();i++){
        	
		if(Character.isLetter(n.charAt(i))){
			f=1;
		}
		 }
        if(f==1){
			System.out.println("no");
        }else
			{System.out.println("yes");	}
			//System.out.println(Character.isDigit('8'));
		
		
		
	
        }
	}

	

