package d1;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
	public static void main(String [] args) {
		int n;
		Scanner anc=new Scanner(System.in);
		System.out.print("Enter the no.of coins");
		 
		n=anc.nextInt();
		String c[]=new String[n+n];
 
		for(int i=0;i<n+n;i++){
			c[i]=anc.next();
		 
		}
		
	ArrayList<String> list = new ArrayList<String>();
	for(int i=0;i<n+n;i++){
	//	System.out.println(c[i]);
	list.add(c[i]);
	}
	 String K  =  "H";
	 
	while(list!=null){
	for (int j = 0; j <= n+n-1; j++) {
	
		if(c[j].equalsIgnoreCase("h")){
		//	System.out.println(c[j]);
			
	//	list.remove(c[j]);
		
		list.set(j , "-");
		
			 if(j==1){ if((c[0]!="-")&&(c[j+1]!="-")){ 
				if(c[0].equalsIgnoreCase("h")){
					list.set(0 , "T");
				}
				else{
					list.set(0, "H");
				}
				if(c[j+1].equalsIgnoreCase("h")){
					 c[j+1]="T";
					list.set(j+1 , "T");
				}
				else{c[j+1]="H";
					list.set(j+1, "H");
				}
				}}
			 if(j==n+n-1){ if((c[j-1]!="-")&&(c[n+n-1]!="-")){
				 if(c[j-1].equalsIgnoreCase("h")){
						list.set(j , "T");
					}
					else{
						list.set(j, "H");
					}if(c[n+n-1].equalsIgnoreCase("h")){
						list.set(n+n-1 , "T");
					}
					else{
						list.set(n+n-1, "H");
					}
					 
			 }}
		 if(j>0){ if((c[j-1]!="-")&&(c[n+n-1]!="-")){ 
		if(c[j-1].equalsIgnoreCase("h")){
			list.set(j-1 , "T");
		}
		else{
			list.set(j-1, "H");
		}if(c[j+1].equalsIgnoreCase("h")){
			list.set(j+1 , "T");
		}
		else{
			list.set(j+1, "H");
		}
		 
		 
		
		}}

		 if(j<n+n-2){ if((c[j-1]!="-")&&(c[j+1]!="-")){
			 if(c[j-1].equalsIgnoreCase("h")){
				 c[j-1]="T";
					list.set(j-1 , "T");
				}
				else{ c[j-1]="H";
					list.set(j-1, "H");
		if(c[j+1].equalsIgnoreCase("h")){
			 c[j+1]="T";
			list.set(j+1 , "T");
		}
		else{c[j+1]="H";
			list.set(j+1, "H");
		}
		 
		 
		 
		 
		 }}}
	
	   }   System.out.println(list);
	  
	   list.remove(K);
} 
System.out.println(list);}}
}
