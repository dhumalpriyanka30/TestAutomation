package Array;

public class multi_dimen_array {

	public static void main(String[] args) 
	{
		int a[][]=new int[2][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		
		for (int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			 System.out.println();
		}
     
		
		
		System.out.println("============Another Method============");
		
	   String s[][]= {{"jiya","komal"},{"priya","harsh"},{"abhi","anup"}};
	   for(int i=0;i<=1;i++)
	   {
		   for(int j=0;j<=1;j++)
		   {
			   System.out.print(s[i][j]+" ");
		   }
			   System.out.println();
	   }
	   
	   
	   
	}

}
