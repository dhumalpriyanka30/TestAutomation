package Polymhorphism;

public class Method_ovverloading
{

	public static void main(String[] args)
	{
		Method_ovverloading mo=new Method_ovverloading();
		mo.add(10,20);
		mo.add(20,30,10);
		// TODO Auto-generated method stub

	}
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}
	
	public void add(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("sum is "+ sum);
	}

}
