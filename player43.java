package player;

import java.util.Scanner;

public class player43 {
	public static void main(String sk[]){
	    Scanner aa=new Scanner(System.in);
	    System.out.println("enter the string");
	    String s= aa.nextLine();
        System.out.println("enter the substring");
        String ss=aa.nextLine();
       int l= (ss.length());
       int k=l;
       System.out.println(l);
       String v="";
       for(int i=0;i<s.length();i++){
    	   v+=s.charAt(i)+"";
    	   if(i==l-1){
    		  
    		   v+=" ";
    		   l =l+k;
    		   
    	   }
       }
       System.out.println(v);
    String a[]=v.split(" ");
       
         int k1=a.length;
        int count=0; 
        for(int i=0;i<k1;i++){
        	 
        	if(ss.equals(a[i])){
        		count++;
        	}
        }
        if(count>=1){
        	System.out.println("true");
        }
   if(count==0)     {
	   System.out.println("false");
   }
	} 
	
 	}
