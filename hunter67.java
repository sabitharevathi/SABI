package hunter;

import java.util.ArrayList;
import java.util.Scanner;

public class hunter67 {
	public static void main(String o[]){
	Scanner aa=new Scanner(System.in);
	int a;
	System.out.println("enter the size of array");
	a=aa.nextInt();
	ArrayList<String> list=new ArrayList<String>();
	System.out.println("enter the element");
	for(int i=0;i<a ;i++){
		 
		list.add(aa.next());
	}
	
	System.out.println(list);
	String [] s =new String[list.size()];
			s=list.toArray(s);
            String k[]=new String[a];
			int n[]=new int[a];
			int p=0,b=0;
		String name[]=new String[a];
		int value=0,m=0;
		 	for(int i=0;i< a;i++){
		  
		 		String d[]=s[i].split("#");  
		 		int q=d.length;
		 		String na="";
		 		name[m]="";
		 		for(int t=0;t<q;t++){
		 			if(t==0){
		 				
		 				na+=d[t];
		 				 
		 			}
		 			else{
		 				value+=Integer.parseInt(d[t]);
		 	}
		 		}
		 		name[m]=na+"."+value;
		 		
		 		m++;
		 	}
		 	for(int l=0;l<m;l++){
		 	 //	System.out.println(name[l]);
		 	}
		  String nm[]=new String[a];
		  int r[]=new int[a];
		  int g=0;
		 	for(int h=0;h<m;h++){
		 		int x=name[h].indexOf(".");
		 		nm[g]=name[h].substring(0, x);
		 		 
		 		r[g]=Integer.parseInt(name[h].substring(x+1, name[h].length()));
		 		 
		 		g++;
		 		
		 		 
		 	}
		  
		 	 for(int j=0;j<g;j++)
			{
				for(int k1=j+1;k1<g;k1++)
				{
					if(r[j]>r[k1]){
						int tmp=r[j];
			
						r[j]=r[k1];
						r[k1]=tmp;
						}
	
}
				} 
				for(int u=0;u<g;u++){
					if(r[g-1]==r[u])
					{
						 System.out.println(nm[u]);
					}
				}
	}
}
