import java.util.Scanner;


public class checkremove {
	public static void main(String o[]){
	String a;
	
	Scanner abc=new Scanner(System.in);
a=abc.nextLine();
char c[]=new char[10];
int k=0,num=0;

for(int i=0;i<a.length();i++){
	int flag=0;
	for(int j=i+1;j<a.length();j++){
		if(a.charAt(i)==a.charAt(j)){
			flag++;
		}}
		if(flag==0)
		{
			c[k]=a.charAt(i);
			k++;
			num++;
			
		}
	}
	for(int t=num;t>=0;t--)
	{
		System.out.println(c[t]);
	}
}
}
