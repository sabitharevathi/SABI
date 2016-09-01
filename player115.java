package player;

import java.util.Scanner;

public class player115 {
	
	public static void main(String arg[]){
	Scanner aa=new Scanner(System.in);
	int a;
	System.out.println("enter the s");
	a=aa.nextInt();
	String s=String.valueOf(a);
	int u=0;
	for(int i=0;i<s.length();i++){
		String c=s.charAt(i)+"";
		int  k=Integer.parseInt(c);
		u+=k*k;
	}
	System.out.println(u);}
}
