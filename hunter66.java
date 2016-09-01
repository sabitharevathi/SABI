package hunter;

import java.util.Scanner;


public class hunter66 {
	public static void main(String sk[]){
    Scanner aa=new Scanner(System.in);
	int a;
	System.out.println("enter the size of array");
	a=aa.nextInt();
	String b[]=new String[a];
	System.out.println("enter the element");
	for(int i=0;i<b.length;i++){
		b[i]=aa.nextLine();
	}
	int count=0;
	for(int i=0;i<b.length;i++){
		if(b[i].length()>2){
			if((b[i].startsWith("10"))||(b[i].startsWith("01"))){
				count++;
			}
		}
	}
	System.out.println("count value ="+count);
	}
	
	
	
}
