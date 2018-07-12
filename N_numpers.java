package Hari;
import java.util.*;
public class N_numpers {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0,a=n;
		String num = " ";
		while(a!=0){
			r=a%10;
			a=a/10;
			
			num+=" "+r;
		}
			System.out.println(num);
			StringBuffer sb=new StringBuffer();

			sb.append(num);
			System.out.print(sb.reverse().toString());
			
		
	}

}
