package Exception;

public class Finally_Block {

	public static void main(String[] args)
	{
		String s=null;
		
		try
		{
			System.out.println(s.length());
		}

		catch(NullPointerException e)
		{
			System.out.println(" PLease check string ");
		}
		
		catch(Exception e)
		{
			System.out.println("somehing went wrong");
		}
		
		finally
		{
			System.out.println("Hello everyone");
		}
		}

}
