import java.util.Scanner;


public class p {
    public static void main(String [] args){
    int nums;
    int out;
    Scanner ss=new Scanner(System.in);
    nums=ss.nextInt();
    int a;
    System.out.println("power is=");
    Scanner sa=new Scanner(System.in);
    a=sa.nextInt();

    {
    	
    	out=(int) Math.pow(nums,a);
    	System.out.println(out);	
    }
    }
}
