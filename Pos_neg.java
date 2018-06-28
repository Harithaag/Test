package Hari;
import java.util.*;
public class Pos_neg {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	//	for(int i=1;i<=100000;i++);
		if(n>=1||n<=100000){
			if(n==0){
			System.out.println("zero");
			}else
			{if(n<=1){
				System.out.println("Negative");
			}
				else{
					System.out.println("Positive");
			}
		}
		
		}
	}

}
