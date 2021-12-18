package Exception;

public class Nullpoint_excep {

	public static void main(String[] args)
	{
	 int a=20;
	 int b=0;
	 
	try
	{
		 int div =a/b;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Hi");
		System.out.println("divide by zero error");
	}
	
	
	
	}

}
