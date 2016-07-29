package player;

import java.util.Scanner;

public class print {
	public static void main(String dss[]){
		String s;
		Scanner abc=new Scanner(System.in);
		s=abc.next();
		char ss[]=new  char[100];
		int k=0;
		int l=s.length();
		for(int i=0;i<l-1;i++){
			for(int j=i+1;j<i+2;j++){
				if(j<=s.length()-1){
					char arr[];
				if(s.charAt(i)==(s.charAt(j))){
					ss[k]=s.charAt(i);
				k++;
					ss[k]='*';
										
				}
				else
				{		
					
				ss[k]=s.charAt(i);
				
									
				}k++;

			
		}}}
		System.out.println(s);
		ss[k]=s.charAt(s.length()-1);
		System.out.println(ss[k]);
	for(int i=0;i<=k;i++){
		System.out.print(ss[i]);
	}
	}
}

