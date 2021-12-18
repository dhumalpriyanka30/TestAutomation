package Array;

import java.util.Arrays;

public class simple1 {

	public static void main(String[] args)
	{
		int id[]=new int[5]; //array declaration
		id[0]=101;
		id[1]=102;   // array intializaation
		id[2]=109;
		id[3]=104;
		id[4]=105;
		
		System.out.println(id[2]);
		System.out.println(id.length);
		System.out.println("==========asecding order=========");
	Arrays.sort(id);
		for(int i=0;i<=4;i++)
		{
			System.out.println(id[i]);
		}
		System.out.println("===========decending order===========");
		for(int i=4;i>=0;i--)
		{
			System.out.println(id[i]);
		}
		
		System.out.println("===array alternate method==========");
		
		int pageno[]= {1,9,3,5,4,6,8,7,9,10};
		//System.out.println(pageno[1]);
		System.out.println("=========acending order=======");
		Arrays.sort(pageno);
		for(int i=0;i<=9;i++)
		{
			System.out.println(pageno[i]);
			
		}
		
		System.out.println("=======decending order========");
		for(int i=pageno.length-1;i>=0;i--)
		{
			System.out.println(pageno[i]);
		}
		System.out.println( );
		
		
	}

}
