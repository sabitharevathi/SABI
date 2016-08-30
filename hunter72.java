package hunter;

import java.util.Scanner;

public class hunter72 {
	public static void main(String o[]){
		String a;
		
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the string");
	a=abc.nextLine();
String d[]=a.split(" ");
int l=d.length;
String s="",s2="";
int i=0;
 
 while(i<=l-1){
	 if(i==0){
		 StringBuffer br=new StringBuffer(d[i]);
			br.reverse();
			// System.out.println(br+" ");
			String s1=new String(br);
			s2=s1; 
	 }
	 else if(i%2==0){
	 
	StringBuffer br=new StringBuffer(d[i]);
	br.reverse();
	//eSystem.out.print(br+" ");
	String s1=new String(br);
	s2=s1;
	  
	 }
	 else{
		 s+=s2+" "+d[i]+" ";
	 }
		i++;
 

	
	} 
  System.out.print(s+"");
	}


}
