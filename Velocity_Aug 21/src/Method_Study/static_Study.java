package Method_Study;

public class static_Study {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Hi i am main method");
		myMethod();    // static method call from same class
        method1_study.myMethod1(); //static method from diff class
	}

	
	
	
	
	public static void myMethod()     //method name static regular method

	{                                                // method defination
		System.out.println("hi i am static mthod");
	}

}
