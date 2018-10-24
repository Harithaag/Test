package player;

import java.util.Scanner;

public class Camel_case {
	public static void main(String s[]){
		int t=0,u=0,m=65;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char a[]=str.toCharArray();
		m=64;
		for(int i=0;i<a.length;i++){
			if(a[i]!=' '&& i==0||a[i-1]==' '&&a[i]!=' '){
				t=(int)a[i];
				if(t>=65 && t<=90){
					a[i]=(char)(t);
				}
				else
			     a[i]=(char)(t-32);
			}
			    else  if(i!=0 && a[i]!=' '|| a[i+1]==' ' && a[i]!=' ')
			    {
			    	u=(int)a[i];
			    	if(u>=97 && u<=122){
						a[i]=(char)(u);
					}
					else
				     a[i]=(char)(u+32);
				}
			    }
			    
	
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		}


		
	}


