package player;

import java.util.Scanner;

public class player117 {
	public static void main(String arg[]){
	Scanner aa=new Scanner(System.in);
	String s;
	System.out.println("enter the string");
	s=aa.next ();
	StringBuffer br=new StringBuffer(s);
	br.reverse();
	String ss=new String(br);
	String a="";
	for(int i=0;i<ss.length();i++){
		String c=ss.charAt(i)+"";
		a+=c+"-";
	}
	 	 System.out.println(a);}
}
