package Hari;

import java.util.*;
import java.util.Scanner;

public class Repeated_num_sort {
public static void main(String s[]){
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	//int m=0;
	
	List<Integer> a1=new LinkedList<Integer>();
	for(int i=0; i<n;i++)
	{
		a[i]=sc.nextInt();
		a1.add(a[i]);
	}
	TreeSet<Integer> a2=new TreeSet<Integer>();
	for(int i=0;i<a1.size()-1;i++){
		if(a[i]==a[i+1]){
			//System.out.println(a[i+1]);
		a2.add(a[i]);
		

	}	
}System.out.println(a2);
//	Collections.sort(a1);
	//Iterator<Integer> it =a1.iterator();
	//while(it.hasNext()){
		//System.out.println(it.next());		
	//}
	
	
		
}
}
