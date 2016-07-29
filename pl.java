import java.util.Scanner;


public class ro {
	public static void main(String kd1[]){
		int a1,k1=0;
		System.out.println("enter the size of array");
		Scanner abc=new Scanner(System.in);
		a1=abc.nextInt();
		int b1[]=new int[a1];
		int aa1[]=new int [a1];
		System.out.println("enter the array");
		for(int i=0;i<a1;i++){
			b1[i]=abc.nextInt();
		}
		System.out.println("enter the element to rotate");
		int dk1;
		dk1=abc.nextInt();
		for(int i=0;i<=a1-1;i++){
			if(b1[i]==dk1){
				while(i<=a1-1){
					i++;
					//System.out.println(i);
					aa[k]=b[i];
					System.out.println(aa[k]);
					k++;
					
					if(i==a1-1){
						i=0;
						while(i<=dk1-1){
							aa1[k]=b1[i];
							System.out.println(aa1[k]);
							k1++;
							i++;
						}
						
					}
				}
				
			}
			
		}
		}
			
		}



