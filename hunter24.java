package hunter;

import java.util.Scanner;

public class hunter24 {
	public static void main(String sk[]){
		Scanner aa=new Scanner(System.in);
		int a;
		System.out.println("enter the size of array");
		a=aa.nextInt();
		int b[]=new int[a];
		System.out.println("enter the element");
		for(int i=0;i<a;i++){
			b[i]=aa.nextInt();
			}
		System.out.println("enter the target");
		int count=0;
		int c=aa.nextInt();
		for(int i=0;i<a;i++){
		for(int j=i+1;j<a;j++){
		if(b[i]+b[j]==c){
			count++;
			System.out.println("value are="+b[i]+" "+b[j]);
		}}
		if(count==0){
			System.out.println("there is no element ");
		}
		}
		}
	 
}
