package Logical_program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fact=1;
		
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is" +fact);
	}

}
