package Access_specifier;

public class Private_use 
{
	int a=20;
	private int b =30;
	protected  static int c =40;
	public int d =50;
	

	public static void main(String[] args)
	{
		
		Private_use u=new Private_use();
		
		u.add();
		u.mul();
		u.sub();
		display();
		System.out.println("value of a is "+u.a);
		System.out.println("value of b is "+u.b);
		
		System.out.println("value of c is "+u.c);
		
		System.out.println("value of d is "+u.d);
		
		
		}

	
	private void add()
	{
		int a=10;int b=20;int c=40;
		int sum= a+b+c;
		System.out.println("sum is "+sum);
	}
	
	
	public void mul()
	{
		
		int a=2;int b=6;int c=3;
		int mul = a*b*c;
		System.out.println("multiplication is "+mul);	
		
		
		
	}
	void sub()
	{
	int a=30;int b=10;
	int sub= a-b;
	System.out.println("substraction is "+sub);
	}
	
	protected static void display()
	{
		System.out.println("Hi I am protected method");
	}
	
	
}




