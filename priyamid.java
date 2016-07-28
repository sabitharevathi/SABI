import java.util.Scanner;


public class priyamid {
	
	public static void main(String q[])
	{
		int tmp=0,num,count=0,tmpt=0;
		Scanner abc=new Scanner(System.in);
		num=abc.nextInt();{
		for(int i=0;i<num;i++)
		{
			tmp=tmpt;
			count++;
			for(int k=0;k<num-i-1;k++)
			{
				System.out.print("  ");
			
			}
			for(int j=0;j<count;j++)
			{
				{
				if(j<=(count/2))
				{
					tmp++;
					if(tmp==10)
					{
						tmp=0;
						
					}
					
					System.out.print(tmp+" ");
					if(j==(count/2))
					{
						tmpt=tmp;
					
					}}
				
					
				else{
					tmp--;
					if(tmp<0)
					{
					tmp=9;
					}
					System.out.print(tmp+" ");
				}
			}}System.out.println();
		count++;}}
		}
	}
	

