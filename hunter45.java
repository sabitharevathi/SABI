package hunter;

import java.util.ArrayList;
import java.util.Scanner;

public class hunter45 {
	public static void main(String u[]){
		 Scanner aa=new Scanner(System.in);
		 String a="";
		 System.out.println("enter the no words in the string");
		 int s=aa.nextInt();
		 System.out.println("ENTER THE String");
		for(int i=0;i<s;i++){
			a+=aa.next()+" ";
		}String p="";		ArrayList<String> list=new ArrayList<String>(); 
		 String d[]=a.split(" ");
		 int l=d.length;
		 
		 for(int i=0;i<d.length;i++){
			 list.add(d[i]);
			 
			 if(d[i].length()<2){
				 p+=d[i]+" ";
				 
			 }
		 }System.out.println(list);System.out.println(p);
	}
}
