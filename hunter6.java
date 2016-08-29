package hunter;

import java.util.Scanner;

public class hunter6 {
	public static void main(String sk[]){
		Scanner aa1=new Scanner(System.in);
		int c;
		System.out.println("enter the size of array");
		c=aa1.nextInt();
		int o[]=new int[c];
		int k=0;
System.out.println("enter the values");
int []n=new int[c];
int b=0;
for(int i=0;i<n.length;i++){
	n[i]=aa1.nextInt();
	
}int count=0;
for(int i=0;i<n.length;i++){
	
	 
		if(n[0]==n[i]){
			count++;
		}
}
	 
	if(count==1){
		System.out.println("there is no repeated in first element"+" "+n[0]);
	}
	else{
		System.out.println("repeated element"+" "+n[0]+" count = "+count);
		 
	 
 

}
	}
}
