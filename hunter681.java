package hunter;

import java.util.ArrayList;
import java.util.Scanner;

public class hunter681 {
	public static void main(String sk[]){
	Scanner aa=new Scanner(System.in);
	int a;
	System.out.println("enter the size of array");
	a=aa.nextInt();
	String p[]=new String[a];
 int m= 0;
System.out.println("enter the values");
int []n=new int[a];
int b=0;
for(int i=0;i<n.length;i++){
n[i]=aa.nextInt();
}
for(int t=0;t<n.length-1;t++){
	for(int j=t+1;j<=t+1;j++){
		int k=Math.abs(n[t]-n[j]);
		p[m]="";
		p[m]+=k+"."+n[t]+"/"+n[j];
		m++;
	}
	
	
	}
for(int i=0;i<m;i++){
	//System.out.println(p[i]);
}
int ans[]=new int[a];
	int no[]=new int[a];
	int no1[]=new int[a];
int k=0;
for(int t=0;t< m;t++){
	 int c=p[t].indexOf(".");
	 int c1=p[t].indexOf("/");
	 
		  
		 	ans[k]=Integer.parseInt(p[t].substring(0, c) );
			no[k]=Integer.parseInt(p[t].substring(c+1, c1) );
			no1[k]=Integer.parseInt(p[t].substring(c1+1, p[t].length()) );
			k++;
		 
	}
for(int i=0;i<m;i++){
	for(int j=i+1;j<m;j++){
		if(ans[i]>ans[j]){
			int tmp=ans[i];
			ans[i]=ans[j];
			ans[j]=tmp;
		}
	}
} int v=0;
for(int i=0;i<m;i++){
	if(ans[m-1]==ans[i]){
		if(no[i]>no1[i]){
			 v=no[i];
			
		}
		else{
			v=no1[i] ;
		}
	}
}  
 
for(int i=0;i<n.length;i++){
	if(n[i]==v){
		System.out.println("postion of "+v+"="+i);
	}
	 
}
 
} 
}
