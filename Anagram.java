package player;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String str=sc.nextLine();
		int n=sc.nextInt();
		String[] st=new String[n];
		String c[]=new String[n];
		String str="";
		int f=0;
		for(int i=0;i<n;i++){
			st[i]=sc.next();


		}
		for(int i=0;i<st.length;i++){
			str=""+st[i];
			char val[]=str.toCharArray();
			for(int j=0;j<val.length;j++){
				for(int k=j+1;k<val.length;k++){
					if(val[j]>val[k]){
						char t=val[j];
						val[j]=val[k];
						val[k]=t;

					}
				}
			}
			//System.out.println(val);
			String h=new String(val);
			c[i]=h;
		}
		for(int k=0;k<c.length;k++){
			for(int j=k+1;j<c.length;j++){
				if(c[k].equals(c[j])){
					f=f+1;
				}	

			}
		}
		System.out.println(f);

		sc.close();
	}

}
