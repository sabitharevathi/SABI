package player;

import java.util.Scanner;

public class player114 {
	public static void main(String arg[]){
	Scanner aa=new Scanner(System.in);
	System.out.println("enter the string");
	String s=aa.next();
	System.out.println("enter the string");
	String s1=aa.next();
	int l=s.length();
	int l1=s1.length();
    String a="";
	if(l==l1){
		a+=s+""+s1;
	}
	else{
		String ss=s.substring(l-l1, l);
		a+=ss+""+s1;
	}
	System.out.println(a);
	}
}
