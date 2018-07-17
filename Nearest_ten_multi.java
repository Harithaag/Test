package Hari;

import java.util.Scanner;

public class Nearest_ten_multi {

	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=n%10;
		int k1=10-k;
		System.out.println(k1+n);

}
}
