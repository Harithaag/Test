package Hari;
import java.util.*;

public class Number_space {
public static void main(String s[]){
	int f=0;
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	
	
	f=1;
  for(int i=0;i<str.length();i++){
	//  char a[i]=str.toCharArray();
	 if(str.charAt(i)==' '){
	f++;;	 
	 }
  
	

  }
  System.out.println(f-1);
}
}



