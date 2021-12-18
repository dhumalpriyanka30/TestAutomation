package Array;

import java.util.Arrays;

public class sample3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String b[]=new String[4];
		
		b[0]="ram";
		b[1]="shital";
		b[2]="jiya";
		b[3]="komal";
		
		System.out.println("====ascending order=========");
		
        Arrays.sort(b);
 
        
        for(int i=0;i<=b.length-1;i++)
        {
        	System.out.println(b[i]);
        	
        }
        
        System.out.println("=======decending order=======");
        for(int i=b.length-1;i>=0;i--)
        {
        	System.out.println(b[i]);
        }

	}

}
