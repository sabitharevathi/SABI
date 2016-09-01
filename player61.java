package player;

import java.util.Scanner;

public class player61 {
	public static void main(String u[]){
	 Scanner aa=new Scanner(System.in);
		int a;
		System.out.println("enter the size of array");
		a=aa.nextInt();
		System.out.println("enter the element");
		int b[]=new int[a];
		for(int i=0;i<a;i++){
			b[i]=aa.nextInt();
		}
		System.out.println("enter the target");
		int k=aa.nextInt();
		int count=0;
		for(int i=0;i<a;i++){
			for(int i1=i+1;i1<a;i1++){
				if(b[i]+b[i1]==k){
					count++;
				
					System.out.println("value are ="+b[i]+" "+b[i1]);
				}
			}
		}
		if(count==0){
			System.out.println("there is no element in array");
		}
}}
