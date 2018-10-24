package player;

import java.util.Scanner;

public class Encoding_alpha {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int val=97;
		
		for(int i=0;i<str.length();i++){
			char a[]=str.toCharArray();
			//System.out.println(a[i]);
			int b=(int)(a[i]);
		
			if(b>119)
				System.out.print((char)(b-23));
			else
				System.out.print((char)(b+3));
			
			
		}
	}

}
