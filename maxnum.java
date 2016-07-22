
	import java.util.Scanner;




	public class maxnum {
		public static void main(String [ ] arg) {
			int  B[]=new int[10];
			Scanner name=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
		B[i]=name.nextInt();
		}
		
			for(int j=0;j<3;j++)
		{
				for(int k=j+1;k<3;k++)
				{
				if(B[j]>B[k])
				{
					int tmp=B[j];
					B[j]=B[k];
					B[k]=tmp;
					
				}
			}
			}
		System.out.println(B[2]);
			
		
			
			 
		}

	}

