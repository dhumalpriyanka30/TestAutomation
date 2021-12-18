package Logical_program;

import java.util.Scanner;

public class Number_Revese {

	public static void main(String[] args)
	{

		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		 int rev=0;
		 int rem=0;
		for ( ;n!=0;)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse number is " +rev);
	}

}
