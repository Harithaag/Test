package Hari;
import java.util.*;
public class Number_special_character {
	public static void main(String s[]){
		int f=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		f=0;
		for(int i=0;i<str.length();i++){
			if((!Character.isDigit(str.charAt(i)))&&(!Character.isLetter(str.charAt(i)))){
				//String str1=str.All(str.charAt(i)," ");
				f++;
				//break;
			}	
				
			else
				if(f==0)
			f=0;
				
			}System.out.println(f);
		}
}


