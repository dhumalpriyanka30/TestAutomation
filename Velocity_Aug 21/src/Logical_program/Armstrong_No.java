
package Logical_program;

public class Armstrong_No {

	public static void main(String[] args)
	{
		int n=153;
	    double rem=0; //reminder
		double sum=0;
		double cube=0;
		int temp=n;  // temp is temporary variable
		
		while(n!=0)
		{
			rem=n%10;
			cube= Math.pow(rem, 3);
			sum=sum+cube;
			n=n/10;
			
			
		}
		if(sum==temp)
		{
			System.out.println("Armstong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

	

	

}
