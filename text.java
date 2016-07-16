
public class text{
public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("An integer with an argument is expected");
		}
			int a;
			a=Integer.parseInt(args[0]);
      if(a>0)
		{
			System.out.println("The number is positive");
			}
		else if(a==0)
		{
			System.out.println("The number is neither positive nor negative");
		}
		else
		{
			System.out.println("The number is negative");
		}
	}

}
