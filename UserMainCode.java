import java.io.*;
import  java.util.*;

class UserMainCode
{

    public static long output1;
	    
    public static void main(String d[])
    {
    	 nthFibonacci(1);
    }
		
    public static void nthFibonacci(int input1){
        //Write code here
    	if(input1==1)
    	{
    		System.out.println(output1=0);
    	}
    	else if(input1==2)
    	{
    		output1=1;
    		
    	}
    	else
    	{
    	int f1=0,f2=1;
    	

    	for(int i=0;i<input1-2;i++)
    	{
    	output1=f1+f2;
    	f2=f1;
    	f1=(int)output1;
    	
    }System.out.println(output1);
}
    	
}
}


