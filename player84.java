package player;

import java.util.Scanner;

public class player84 {
	public static void main(String dd[]){
		String n;
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the  String");
		n=abc.nextLine();
	//	StringBuffer br=new StringBuffer(n);
		//br.reverse();
		//
		String d[]=n.split(" ");
		System.out.println(d[0]);
		int k=d.length;
		String p="";
		for(int i=k-1;i>=0;i--){
			p+=d[i]+" ";
		}
		System.out.println(p);
	}
}
