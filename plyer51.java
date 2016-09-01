package player;

import java.util.Scanner;

public class plyer51 {
	public static void main(String sk[]){
	    Scanner aa=new Scanner(System.in);
		int a;
		System.out.println("enter the size of array");
		a=aa.nextInt();
		System.out.println("enter the element");
		int b[]=new int[a];
		for(int i=0;i<a;i++){
			b[i]=aa.nextInt();
		}
		for(int j=0;j<b.length;j++){
			for(int k=j+1;k<b.length;k++){

				if(b[j]>b[k]){
					int tmp=b[j];
		
					b[j]=b[k];
					b[k]=tmp;
					}}}
		System.out.println(b[1]);}
}
