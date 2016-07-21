import java.util.Scanner;


public class factorial {
public static void main(String a[]){
	int j=1,s;
	Scanner abc=new Scanner(System.in);
	
	s=abc.nextInt();
	

	for(int i=1;i<=s;i++){
		j=j*i;
	}
	System.out.println(j);
}}

