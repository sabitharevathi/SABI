package project;

import java.util.Scanner;

public class caluator {
	public static void main(String  g[]){
	int a,b;
	Scanner abc=new Scanner(System.in);
	System.out.println("enter the value");
	a=abc.nextInt();
	System.out.println("enter the value");
	b=abc.nextInt();
	char ch;
	System.out.println("enter the operation");
	ch=abc.next().charAt(0);
	int out;
	switch(ch){
	case '+':
		
		out=a+b;
		System.out.println("result  "+ out);
		break;
case '-':
		
		out=a-b;
		System.out.println("result  "+ out);
		break;
case '/':
	
	out=a/b;
	System.out.println("result  "+ out);
	break;
case '*':
	
	out=a*b;
	System.out.println("result  "+ out);
	break;
case '%':
	
	out=a%b;
	System.out.println("result  "+ out);
	break;
	default:
		System.out.println("invalid operation");
	}
}}

