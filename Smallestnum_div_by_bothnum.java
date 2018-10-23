package player;

import java.util.Scanner;

public class Smallestnum_div_by_bothnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int n=1;
		while(n>0){
			if(n%l==0 && n%r==0){
				System.out.println(n);
			break;
			}
			else
				n++;
		}
sc.close();
	}

}
