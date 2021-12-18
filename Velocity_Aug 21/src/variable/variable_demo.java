package variable;

public class variable_demo
{ 
	static int a=60; //static global variable

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	
	public void test()
	{
		int b=10;
		int sum=b+a;
		//a=sum+b;
		System.out.println("additon is  " +sum);
		System.out.println("value of a is" +a);
	}

}
