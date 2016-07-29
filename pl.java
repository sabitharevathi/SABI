import java.util.Scanner;


public class rotated {
	public static void main(String kd[]){
		int a,k=0;
		System.out.println("enter the size of array");
		Scanner abc=new Scanner(System.in);
		a=abc.nextInt();
		int b[]=new int[a];
		int aa[]=new int [a];
		System.out.println("enter the array");
		for(int i=0;i<a;i++){
			b[i]=abc.nextInt();
		}
		System.out.println("enter the element to rotate");
		int dk;
		dk=abc.nextInt();
		for(int i=0;i<=a-1;i++){
			if(b[i]==dk){
				while(i<=a-1){
					i++;
					//System.out.println(i);
					aa[k]=b[i];
					System.out.println(aa[k]);
					k++;
					
					if(i==a-1){
						i=0;
						while(i<=dk-1){
							aa[k]=b[i];
							System.out.println(aa[k]);
							k++;
							i++;
						}
						
					}
				}
				
			}
			
		}
		}
			
		}



