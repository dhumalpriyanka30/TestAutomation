package Method_Study;

public class Sample3Add 
{

	public static void main(String[] args) // static method
	{
		// TODO Auto-generated method stub
     
     Sample3Add s=new Sample3Add(); //non static method call
     s.sub();
     sum();
     Sample3Add s1=new Sample3Add();
     s1.mul(10,7);
	}

	
	public static void sum()
	
	{ 
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("addition of two number is " + sum);
	}
	
	
	public void sub() //non static method without parameter
	
	{
		int a=20;
		int b=10;
		int subs =a-b;
		System.out.println("substraction of two numbers is " +subs);
	}
	
	public void mul(int a,int b)  //non static with parameter method
	{
		
		int mult=a*b;
		System.out.println("multiplication of two number is "+mult);
	}
	
}
