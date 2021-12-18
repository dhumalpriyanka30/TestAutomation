package Method_Study;

public class Non_static_method_demo {

	
	public void demo()
	{
		System.out.println("Hi I am non static method ");
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("Hi I am main method");
		// TODO Auto-generated method stub
		//object creation of class
		
		Non_static_method_demo d=new Non_static_method_demo();
		
		
		// syntax------->classname objectname = new classname
		
		//how to call method
	    // syntax-----> objectname.methodname();
				
		d.demo();

	}

}
