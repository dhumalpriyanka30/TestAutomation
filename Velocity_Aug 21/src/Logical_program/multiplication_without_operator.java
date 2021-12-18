package Logical_program;

import java.util.Scanner;

public class multiplication_without_operator {

	public static void main(String[] args) {
		
		System.out.println("Enter the first number");
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		System.out.println("Enter the second number");
		int n2=s.nextInt();
		int sum=0;
		for(int i=1;i<=n2;i++)
		{
			sum=sum+n1;
		}
		System.out.println(sum);
	}

}
