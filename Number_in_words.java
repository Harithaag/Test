package Hari;

import java.util.Scanner;

public class Number_in_words {

	 
		public void num(int n,String str)
		{
			String one[] = { " ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
					"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen",
					"Nineteen" };
	 
			String ten[] = {" "," ","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety" };
	 
			if (n > 19)
			{
				System.out.print(ten[n/10]+" "+one[n%10]);
			}
			else
			{
				System.out.print(one[n]);
			}
			if (n > 0)
				System.out.print(str);
		}
	 
		public static void main(String s[])
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			//System.out.print(n);
			
			
			
				Number_in_words a = new Number_in_words();
			//	a.pw((n / 1000000000), " Hundred");
				a.num((n / 10000000) % 100, " crore");
				a.num(((n / 100000) % 100), " lakh");
				a.num(((n / 1000) % 100), " thousand");
				a.num(((n / 100) % 10), " hundred");
				a.num((n % 100)," ");
			
		}
	}
