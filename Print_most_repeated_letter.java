package player;

import java.util.Scanner;

public class Print_most_repeated_letter {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String st="";
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					st=""+str.charAt(j);
					
				}
			}

		}
		
			System.out.println(st);
		
		sc.close();
	}

}
