package Logical_program;

import java.util.Scanner;

public class seprateNumAnd_DigitString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String n=s.next();
		
		String num="";

		String ch ="";
		for(int i=0;i<=n.length()-1;i++)
		{
			 char  c=n.charAt(i);
			 if(Character.isDigit(c))
			 {
				  num=num+n.charAt(i);
			 }
			 else 
			 {
				 ch=ch+n.charAt(i);
			 }
			 
		}
		
		System.out.println("Number of digit is "+num);
		
		System.out.println("Number ofcharcter is "+ch );
	}

}
