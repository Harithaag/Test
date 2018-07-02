package Hari;

import java.util.Scanner;

public class Mergesort {
	public static void sort(int a[], int l, int h) 
    {
        int n = h - l;         
        if (n <= 1) 
            return; 
        int m = l + n/2; 
    
        sort(a, l, m); 
        sort(a, m, h); 
   
        int temp[] = new int[n];
        int i = l, j = m;
        for (int k = 0; k < n; k++) 
        {
            if (i == m)  {
                temp[k] = a[j];
		    j++;
	    }
            else if (j == h) {
                temp[k] = a[i];
		    i++;
	    }
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < n; k++) 
            a[l + k] = temp[k];         
    }
   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner( System.in );        
        System.out.println("Merge Sort Test\n");
        int n, i;
       
        n = sc.nextInt();
       
        int arr[] = new int[n ];
       
        
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
       
        sort(arr, 0, n);
       
        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();            
    }    
}


