package player;

import java.util.Scanner;

public class player15 {
	public static void main(String u[]){
		 Scanner aa=new Scanner(System.in);
		 String a;
		 System.out.println("ENTER THE String");
		 a=aa.nextLine();
		 String d[]=a.split(" ");
		 int l=d.length;
		 int count=0;int p=0;
		int []s=new int[l];
		 for(int i=0;i<d.length;i++){
			 for(int j=0;j<d[i].length();j++){
				 for(int k=1+j;k<d[i].length();k++){
				 String c=d[i].charAt(j)+"";
				 String n=d[i].charAt(k)+"";
				 if(c.equals(n)){
					 count++;
				 }
			 }
			 }
				 s[p]= count ;
				 p++;
				 count=0;
				 
		 }
		 for(int i=0;i<p;i++) 
			{
				for(int k=i+1;k<p;k++)
				{
					if(s[i]>s[k]){
						int tmp=s[i];
			
						s[i]=s[k];
						s[k]=tmp;
						}
			
		 }
	} System.out.println(s[p-1]);
	 for(int i=0;i<p;i++) 
	if(s[p-1]==s[i]){
		System.out.println(d[i]);
	}
}
}