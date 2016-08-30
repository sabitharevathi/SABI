package pro;

import java.util.Scanner;

public class pro37 {
	public static void main(String o[]){
		int a;
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the value");
	a=abc.nextInt();
int []n=new int[a];
int k=0;
for(int i=0;i<a;i++){
	if(i%2!=0){
		n[k]=i;
		k++;
	}
}int p[]=new int[a];
int c=0;
for(int i=0;i<k;i++){
	System.out.print (n[i]+" ");
	if(n[i]<=9){
		p[c]=n[i];
		c++;
	}
	else{
		int s=n[i];
		int j=s/10;
		int h=s%10;
		int g=j+h;
		p[c]=g;
		c++;
	}
	
	 
}System.out.println();
for(int i=0;i<c;i++){
	if(p[i]%2!=0){
	System.out.print (p[i]+" ");
}}

}
}