package Hari;

import java.util.*;
import java.util.Scanner;

public class Repeated_num_sort {
public static void main(String s[]){
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	
	
	
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	
	}	
	Arrays.sort(a);
	//m=a[0];
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j]){
				System.out.println(a[i]);
				
			}

}
}

	
			
sc.close();
	
		
}
}
