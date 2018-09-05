package player;

import java.util.Scanner;

public class Right_shift {
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int j=0;
		int k1=k;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		if(a.length==1){
			System.out.println(a[a.length-1]);
		}
		else
		for(int i=0;i<n;i++){
			
			
			if(i<k){
				System.out.println(a[a.length-k1]);

			}k1--;
		}j=0;
		for(int i=0;i<n;i++){
			if(i<a.length-k){
				System.out.println(a[j]);

			}j++;

		}
		sc.close();
	}

}
