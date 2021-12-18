package Logical_program;

public class String_Reverse {

	public static void main(String[] args) 
	{
		String s = "abc";
		String rev ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			 rev= rev+s.charAt(i);
		}
		System.out.println("orignal string is " +s);
		System.out.println("Reverse string is "+rev);

		
		if(s.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
