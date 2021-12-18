package variable;

public class variable_test {


	static int a=60; //static global variable
int c=20;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		variable_test v=new variable_test();
		v.test();

	}
	
	
	public void test()
	{
		int b=10;
		int sum=b+a;
		a=sum+b;
		c=c+10;
		System.out.println("value of c is " +c);
		System.out.println("additon is  " +sum);
		System.out.println("value of a is " +a);
	}

}
