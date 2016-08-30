package hunter;

import java.util.Scanner;

public class hunter93 {
	public static void main(String o[]){
		String a;
		Scanner abc=new Scanner(System.in);
	a=abc.nextLine();
	String d[]=a.split(" ");
	int l=d.length;
	 
	String ss="";
	for(int i=0;i<l;i++){
	
	StringBuffer br=new StringBuffer(d[i]);
	br.reverse();
	String s=new String(br);
	ss +=s+" ";
	} String p="",r="";
	ss=ss.toLowerCase();
	for(int i=0;i<ss.length()-1;i++){
		char c=a.charAt(i);
		String h=String.valueOf(ss.charAt(i));
		if((c>=65)&&(c<=90)){
			
			p+=h.toUpperCase();
		 	  
		}
		else{
			p+=h;
			  
		}
		
		
	}
	System.out.println (p);		
	 
}
}