package Hari;

import java.util.Scanner;

public class Add_odd_even {
	 static public  void main(String s[]){
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int m=sc.nextInt();
			int k=n+m;
			if(k%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
					
			
	 }

}
