package pro;

import java.util.Scanner;

public class pro15 {
	public static void main(String sk[]){
		int b;
		Scanner sss=new Scanner(System.in);
		b=sss.nextInt();
		int a[]=new int[b];
		for(int i=0;i<b;i++){
			a[i]=sss.nextInt();
		}for(int j=0;j<b;j++)
		{
			for(int k=j+1;k<b;k++)
			{
				if(a[j]>a[k]){
					int tmp=a[j];
		
					a[j]=a[k];
					a[k]=tmp;
					}
		
				
	}

}for(int j=b-1;j>=0;j--){
	System.out.print(a[j]+" ");
}
	}
}
