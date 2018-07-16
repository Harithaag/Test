package Hari;

import java.util.*;

public class Repetation {
	public static void main (String s[]){
		int f=0;
		Scanner sc=new Scanner(System.in);
		
		String n=sc.next();
		char str=n.charAt(0);
		int a=Character.getNumericValue(str); 
		//System.out.println(a);
		
		int k[]=new int[n.charAt(0)];
		
		for(int i=0;i<a;i++){
		k[i]=sc.nextInt();
		}
		f=0;
		for(int i=0;i<a;i++){
			//System.out.println(k[i]);
			if(Character.getNumericValue(n.charAt(1))==k[i])
			
				f++;
		}System.out.println(f);
		
	}

}
