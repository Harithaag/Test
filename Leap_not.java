package Hari;
import java.util.*;
public class Leap_not {
	public static void main(String s[]){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%4==0&&n%100==1)
			System.out.println("Yes");
		else 
			if(n%400==0){
			System.out.println("Yes");
			}
			else
			System.out.println("no");
			
		
	}
	

}
