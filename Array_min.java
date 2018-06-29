package Hari;

import java.util.Scanner;

public class Array_min {
	public static void main(String s[]){
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m;
		int a[]=new int[n];
		for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
        }
        m = a[0];
        for(int i = 0; i < n; i++){
            if(m> a[i]){
                m = a[i];
                }
        }
        System.out.println(m);
    }

}
