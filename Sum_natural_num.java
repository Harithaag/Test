package Hari;

import java.util.Scanner;

public class Sum_natural_num {
	public static void main(String str[]){
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int sum=0;
		for(int i=1;i<=s;i++){
			sum+=i;
		}System.out.println(sum);

}
}