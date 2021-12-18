package Logical_program;

import java.util.Scanner;

public class Prime_No {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int count=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
				break;
			}
		}
			if(count==0)
			
			{
				System.out.println("This is prime no");
			}
			
			else
				
			{
				System.out.println(" Not prime");
			}
		


	}

}
