package player;

import java.util.Scanner;

public class pla42 {
	public static void main(String sk[]){
	    Scanner aa=new Scanner(System.in);
		int a;
		System.out.println("enter the size of array");
		a=aa.nextInt();
		System.out.println("enter the element");
		int b[]=new int[a];
		for(int i=0;i<a;i++){
			b[i]=aa.nextInt();
		}int count=0;
		for(int i=0;i<a;i++){
			for(int j=i+1;j<a;j++){
				if(b[i]>b[j]){
					count++;
				}
			}
		}
		if(count==0){
			System.out.println("array is sorted order");
		}
		if(count>=1){
			System.out.println("array is not sorted order");
		}
		}
}
