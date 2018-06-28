package Hari;
import java.util.*;
public class Vowels_consonant {
public static void main(String s[]){
	char b[]={};
			
    Scanner sc=new Scanner(System.in);
	char n=sc.next().charAt(0);

	if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
	{
		
			System.out.println("Vowels");
		}else 
			if((n>='a'&&n<='z')||(n>='A'&&n<='Z'))
				{
					System.out.println("Cosonanat");
				}
			else
			{
				System.out.println("invalid");
			}
	}
}


