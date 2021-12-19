package Logical_program;

import java.util.Scanner;

public class Armstrong_Number1 
{
	public static void main(String[] args)
	{

		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=0;
		
		for(int i=num1;i>0;i=i/10)
		{
			int rem=i%10;
			num2=num2+(rem*rem*rem);
		}
		if(num1==num2)
			
		{
			System.out.println("given number is palindrome");
		}
		
		else
	    {
		 System.out.println("given number is not palindrome");
	    }
		
	}
}
