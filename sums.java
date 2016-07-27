import java.util.Scanner;


public class sums {
	
		public static void main(String a[])
		{
			int n;
			int sum2,s,sum1,a1=0,i=0;
			Scanner ss=new Scanner(System.in);
			n=ss.nextInt();
int k[]=new int[22];
			while(n>1)
			{
		     a1=n%10;
			k[i]=a1;
			i++;
			n=n/10;}
			
	for(int o=0;o<i;o++){
		System.out.print(k[o]);
			}
			}
			
		}





