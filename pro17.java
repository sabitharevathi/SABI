package pro;

public class pro17 {
	public static void main(String dd[]){
		int a[]=new int[100];
		int ks=0;
		for(int i=1;i<100;i++){
			a[ks]=i;
			ks++;
			
		}
		
	for(int i=1;i<100;i++){
		for(int j=i+1;j<100;j++){
			for(int k=j+1;k<100;k++){
				for(int p=k+1;p<100;p++){
				if(a[i]*j*k*p==738){
					System.out.println(a[i]);
				}
				
			}
		}
	}

	}
	}
}
