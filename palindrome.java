import java.util.Scanner;


public class palindrome {
	public static void main(String o[])
	{
int  input1;

Scanner abc=new Scanner(System.in);
input1=abc.nextInt();
StringBuffer br=new StringBuffer(input1);

br.reverse();
String k=new String(br);
System.out.println(br);
	if(input1.equals(k)){
		System.out.println("palindrome");
    }
	else
	{
		System.out.println("not palindrome");
	}}}
