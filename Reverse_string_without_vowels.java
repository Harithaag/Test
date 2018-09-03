package Hari;

import java.util.Scanner;

public class Reverse_string_without_vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		
		String str1="";
		for(int i=0;i<n;i++){
			
			if(str.charAt(i)!='a'&& str.charAt(i)!='e'&& str.charAt(i)!='i'&& str.charAt(i)!='o' && str.charAt(i)!='u'){
				str1+=str.charAt(i);
			}

		}//System.out.println(str1);

		char a[]=str1.toCharArray();
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]);
		}


	}


}


