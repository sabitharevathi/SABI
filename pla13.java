package player;

import java.util.Scanner;

public class pla13 {
	int sums=0,a;

	public int get(int s){
		
	
	int sum=0,sums=0,a;
	while(s>0){
		a=s%10;
		a=a*a;
		sum=sum+a;
		s=s/10;
		if(sum>=100){
			sum=sum/10;
		}
			
	}System.out.println(sum);
	return sum;}

	
	public static void main(String oo[]){
	pla13 p=new pla13();	
	
	int  s;
	Scanner abc=new Scanner(System.in);
	s=abc.nextInt();
	int sum;
	sum=p.get(s);
	if(sum>=100){
		sum=sum/10;
	}
	
		s=sum;
	while(sum!=1){
		sum=p.get(s);
		if(sum>=100){
			sum=sum/10;
		}
		s=sum;
		
	}
	
	
	
}}
	