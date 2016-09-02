package player;

import java.util.Scanner;

public class player11 {
	public static void main(String u[]){
		 Scanner aa=new Scanner(System.in);
		 String a;
		 System.out.println("ENTER THE WORKINGDAY");
		 a=aa.next();
		
		 if(a.equalsIgnoreCase("monday")){
		 	 System.out.println("true");
		 }
		 else if(a.equalsIgnoreCase("tuesday")){
			 System.out.println("true");
		 }
		 else if(a.equalsIgnoreCase("wednesay")){
			 System.out.println("true");
		 }
		 else if(a.equalsIgnoreCase("thursday")){
			 System.out.println("true");
		 }
		 else if(a.equalsIgnoreCase("friday")){
			 System.out.println("true");
		 }
		 else if(a.equalsIgnoreCase("saturday")){
			 System.out.println("false");
		 }
		 else if(a.equalsIgnoreCase("sunday")){
			 System.out.println("false");
		 }
		 
		 
}
}