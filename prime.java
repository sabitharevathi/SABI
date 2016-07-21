import java.util.Scanner;


public class prime {
	public static void main(String q[]){
		int a,count=0;
		Scanner abc=new Scanner(System.in);
		a=abc.nextInt();
		if((a==2)||(a==1)){
			System.out.println("prime no");}

		for(int i=2;i<a;i++){
			if(a%i==0){
				count++;}
		
			else if(count>=1){
				System.out.println("not prime no");}
			else
			{
				System.out.println("prime no");
			}
		}
}}


