package player;

import java.util.Scanner;

public class player111{
	public static void main(String arg[]){
		Scanner aa=new Scanner(System.in);
		int a;
		System.out.println("enter the size of array n=");
		a=aa.nextInt();
		System.out.println("enter the size of array m=");
		int n=aa.nextInt();
		System.out.println("enter the element for array1");
		int sb[]=new int[a];
		for(int i=0;i<a;i++){
			sb[i]=aa.nextInt();
		}
		System.out.println("enter the element for array2");
		int ab1[]=new int[n];
		for(int i=0;i<n;i++){
			ab1[i]=aa.nextInt();
		}
		int kh[]=new int[n+a];
		int h=0;
		int g=0;
		if(n>a){
			g=n;
		}
		else{
			g=a;
		}
		 
		try{
		for(int i=0;i<g;i++){
			for(int j=0;j<g;j++){
				if(sb[i]==ab1[j]){
					kh[h]=sb[i];
					h++;
				}
			}
		}}catch(ArrayIndexOutOfBoundsException e){
		
		} 
		 
		for(int i=0;i<h;i++){
			System.out.println(kh[i]);
		}
		 
		 
		 
		}
		
}
