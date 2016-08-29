package hunter;

import java.util.Scanner;

public class hunter68 {
	 
		public static void main(String o[]){
			String a;
			System.out.println("Enter the Gmail");
			Scanner abc=new Scanner(System.in);
		a=abc.nextLine();
		int count=0;
		for(int i=0;i<a.length();i++){
			 int c=a.charAt(i);
			if(c==64){
				count++;
			}
			}
		int n=a.indexOf("@");
		int n1=a.indexOf(".");
		
		String n2=a.substring(0, n);
		String n4=a.substring(n, n1);
		 String n3=a.substring(n1, a.length());
		 
		if(count==1){
			if(n4.length()>=4){
				if(n2.length()>=3){
					if(n3.equals(".com")){
					System.out.println("Email is valid");
				}else{
					System.out.println("invalid");
				}
				
					}
				else{
					System.out.println("invalid");
				}
				
			}
			else{
				System.out.println("invalid");
			}
		}
		else{
			System.out.println("invalid");
		}
 
	}

}
