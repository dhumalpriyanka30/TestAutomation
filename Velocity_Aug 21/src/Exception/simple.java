package Exception;

public class simple {

	public static void main(String[] args)
	{
		int a[]=new int[2];
		
		//System.out.println("hi");
		//a[3]=20;
		
		
		System.out.println("======try block========");
		try
		{
			a[4]=80; //risky code
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Hello");
			System.out.println("check array size");
		}
		

	}

}
