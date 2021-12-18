package control_statement;

public class If_else_if_demo {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub

		int sub1=60;
		int sub2=70;
		int sub3=50;
		float percentage;
		int sum=sub1+sub2+sub3;
		percentage=sum/3f;
	    int marks=80;
		System.out.println("===================");
		System.out.println("Marks of subject 1 is " +sub1);
		System.out.println("Marks of subject 2 is " +sub2);
		System.out.println("Marks of subject 3 is " +sub3);
		System.out.println("===================");
		
		
		if (percentage>=90)
		{
		System.out.println("You are excellent");
		}
		else if(percentage>=60)
		{
			System.out.println("You are good");
		
		}
		
		else if(percentage>=50)
		{
			System.out.println("You are just pass");
		}

	}
	

}
