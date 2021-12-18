package Method_Study;

public class sample1 {

	
	public void test1()
	{
		System.out.println("Hi I am test1");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		sample1 s1=new sample1(); // same class object
		s1.test1();
		
		sample2 s2=new sample2();  // object if diff class
		s2.test2();
		

	}

}
