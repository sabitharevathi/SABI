package hunter;

import java.util.Scanner;

public class hunter99 { 
	public static void main(String o[]){
		int a[]=new int[25];
		int k=0;
	Scanner abc=new Scanner(System.in);
	int n;
	System.out.println("enter the value");
	n=abc.nextInt();
		for(int i=0;i<n;i++){
			if(i%2!=0){
				a[k]=i;
				k++;
			}
		}
		for(int l=0;l<k;l++){
			for(int j=0;j<k;j++){
				int p=a[l]+a[j];
				//System.out.println(p);
				if(p==24){
					System.out.println(a[l]+" "+a[j]);
				}
			}
			
			
			
			//System.out.println(a[l]);
		}
		
	}
}
