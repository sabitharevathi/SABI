package player;

import java.util.Scanner;

public class player63 {
	public static void main(String arg[]){
	Scanner aa=new Scanner(System.in);
	int a;
	System.out.println("enter the size of array n=");
	a=aa.nextInt();
	System.out.println("enter the size of array m=");
	int n=aa.nextInt();
	System.out.println("enter the element for array1");
	int b[]=new int[a];
	for(int i=0;i<a;i++){
		b[i]=aa.nextInt();
	}
	System.out.println("enter the element for array2");
	int b1[]=new int[n];
	for(int i=0;i<n;i++){
		b1[i]=aa.nextInt();
	}
	int k[]=new int[n+a];
	int h=0;
	int g=0;
	if(n>a){
		g=n;
	}
	else{
		g=a;
	}
	System.out.println(g);
	try{
	for(int i=0;i<g;i++){
		for(int j=0;j<g;j++){
			if(b[i]==b1[j]){
				k[h]=b[i];
				h++;
			}
		}
	}}catch(ArrayIndexOutOfBoundsException e){
	
	}System.out.println(h);
	if(h>=1){
		System.out.println("common number");
	for(int i=0;i<h;i++){
		System.out.println(k[i]);
	}
	}
	else{
		System.out.println("-1");
	}
	}
	
}
