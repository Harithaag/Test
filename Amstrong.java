package Hari;
import java.util.Scanner;

public class Amstrong {
	public static void main (String s[]){
		int r,su=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		while(a!=0){
			r=a%10;
			a=a/10;
			su+=r*r*r;
		}
		if(n==su){
			System.out.println("Yes");
		}
			else{
				System.out.println("No");
		}
	}

}
