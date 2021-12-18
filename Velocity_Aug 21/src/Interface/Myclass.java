package Interface;

public  class Myclass  implements MyInterface
{

	public static void main(String[] args) 
	{
		Myclass m=new Myclass();
		m.test2();
		m.test3();
		m.test4();
		// TODO Auto-generated method stub

	}
	public void test2()
	{
		System.out.println("Hi I am test 2");
	}
	@Override
	public void test3() 
	{
		System.out.println("Hi I am test 3");
		
	}
	@Override
	public void test4()
	{
		System.out.println("Hi I am test 4");
		
	}

}
