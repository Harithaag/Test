package Hari;

import java.util.Scanner;

public class Vowles_in_String {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int f=0;
		char[] a=str.toCharArray();
		char[] b={'a','e','i','o','u'};
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j])
					f++;
				break;
			}
		}
	if(f!=0)
		System.out.println("yes");
	else
		System.out.println("no");
		}

}
