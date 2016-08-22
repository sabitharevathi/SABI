package hunter;

import java.util.Scanner;

public class hunter56 {
	 public static void main(String ayt[]){
		int arg[]=new int[5];
		Scanner ff=new Scanner(System.in);
		for(int i=0;i<5;i++){
			arg[i]=ff.nextInt();
		}
		int a1=0;
		int rc[]=new int[50];
		int crh[]=new int[15];

	for(int j=0;j<5;j++){
		for(int k=0;k<5;k++){
			if(arg[j]!=arg[k]){
				rc[a1]=arg[j]+arg[k];
				
				a1++;
			}
		}
	}
	
	
	 
	for(int q=0;q<a1;q++){
		for(int w=q+1;w<a1;w++){
			if(rc[q]>rc[w]){
				int tmp=rc[q];
				rc[q]=rc[w];
				rc[w]=tmp;
			}
		}
	}
	int ot=0,ot1=0,ot2=0;
	for(int h=0;h<a1;h++){
	 
		if(rc[h]>=-6 && rc[h]<=5){
			ot=rc[h];
		 
		}
	}
	for(int j=0;j<5;j++){
		for(int k=0;k<5;k++){
			if(arg[j]!=arg[k]){
				rc[a1]=arg[j]+arg[k];
				if(rc[a1]==ot){
					ot1=arg[j];
					ot2=arg[k];
					 System.out.print (ot1+" ");
						System.out.print (ot2);

				}}}	}}}
		