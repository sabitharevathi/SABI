package pro;

import java.util.ArrayList;
import java.util.Scanner;

public class pro21level {
	public static void main(String js[]){
		int n;
		Scanner aaa=new Scanner(System.in);
		System.out.print("enter the size of array");
		n=aaa.nextInt();
		int ss[]=new int[n];
		int a[]=new int[n];System.out.print("enter the value");
	for(int i=0;i<n;i++){
		
		a[i]=aaa.nextInt();
	}
	for(int i=0;i<n;i++){
		ss[i]=a[i];}
	ArrayList<Integer> s=new ArrayList();
	ArrayList<Integer> p=new ArrayList();
	
		int k=0,l=0;
		int count=0;int j=1;
	for(int i=0;i<=n-1;i++){
		
		if(count==0){
		
			if(a[i]>ss[j]){
				System.out.println("first"+i);
				s.add(a[i]);
				s.add(ss[j]);
				j++;
				

			}
			else{
				count++;
			}
			}
			
			else
			{System.out.println("seciond"+i);
				p.add(a[i]);
				j++;
				
			}
		}
	
		
	System.out.println(count);

	if(count==0){
		System.out.println("not possible");
		}
	
		System.out.print(s);
	
		System.out.print(p);
	
	

}

}