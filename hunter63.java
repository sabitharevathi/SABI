package hunter;

import java.util.Scanner;

public class hunter63 {
	public static void main(String [] args) {
		int a[]=new int[6];
		Scanner ff=new Scanner(System.in);
		System.out.println("enter the value");
		for(int i=0;i<6;i++){
			a[i]=ff.nextInt();
		}
		int b=6,ac=0;
		int s[]=new int[6];
		int o[]=new int[6];
	for(int i=0;i<5;i++){
		for(int j=i+1;j<b;j++){
			s[ac]=a[j];
			ac++;
		}
		 
		for(int q=0;q<ac;q++){
			for(int w=q+1;w<ac;w++){
				if(s[q]>s[w]){
					int tmp=s[q];
					s[q]=s[w];
					s[w]=tmp;
				}
			}
		}
		o[i]=s[ac-1];
		
		ac=0;
		
	}
	
	for(int s1=0;s1<6;s1++){
	System.out.print(o[s1]+" ");
	}
	
	
	
	}
}
