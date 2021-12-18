package Access_specifier;

public class Access_test {

	public static void main(String[] args) 
	{
		Private_use u=new Private_use();
		u.sub();
		u.mul();
		System.out.println("value of a is "+u.a);
		//System.out.println("value of a is "+u.b);
		System.out.println("value of a is "+u.c);
		System.out.println("value of a is "+u.d);
		
		// TODO Auto-generated method stub

	}

}
