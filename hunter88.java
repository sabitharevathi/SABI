package hunter;

import java.util.ArrayList;
import java.util.Scanner;

public class hunter88 {
	public static void main(String o[]){
		String a;
		Scanner abc=new Scanner(System.in);
	a=abc.nextLine();
	StringBuffer br=new StringBuffer(a);
	br.reverse();
	String s=new String(br);
 
	
	
	
	ArrayList<String> list=new ArrayList<String>();
	ArrayList<String> lists=new ArrayList<String>();
	for(int i=0;i<s.length();i++){
		String b=String.valueOf(s.charAt(i));
	
	list.add(b);}
	System.out.println(list.size());
	//System.out.println(list);String r="";
	for(int i=0;i<list.size();i++){
		for(int j=0;j<list.size();j++){
			
		 
		String a1=list.get(i);
		String a2=list.get(j);
		if(a1.equals(a2)){
			list.remove(a1);
		}
	}
	}//System.out.println(list);
	for(int i=0;i<list.size();i++){
		for(int j=0;j<list.size();j++){
			
		 
		String a1=list.get(i);
		String a2=list.get(j);
		if(a1.equals(a2)){
			list.remove(a1);
		}
	}
	}
		String j="";
		for(String f:list){
			j+=f;
		}
	
	
	System.out.println(j);
	
	}
	
	
	
 
 
	 
	 
}
