package Logical_program;

import java.util.Scanner;

public class Finding_Special_SymbolInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String n=s.next();
		String n1=n.replace("@", "");
		String n2 =n.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(n2);
	}

}
