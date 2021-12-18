package Array;

import java.util.Arrays;

public class sample2 {

	public static void main(String[] args) 
	{
	char a[]=new char[5];
	a[0]='A';
	a[1]='D';
	a[2]='E';
	a[3]='B';
	
	Arrays.sort(a);
	System.out.println("=======acending order======");
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
	
	
	
	System.out.println("=======decending order=========");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
	  
	}

}
