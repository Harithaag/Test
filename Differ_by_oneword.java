package player;

import java.util.Scanner;

public class Differ_by_oneword {
	public static void main(String s[]){
		int f=0,c=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();

		if(str.length()!=str1.length()){
			System.out.println("no");
		}
		else{
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==(str1.charAt(i))){
					//System.out.println("yes");
					f++;
				}
				else

					c++;
			}

			if(c==1)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}

}

