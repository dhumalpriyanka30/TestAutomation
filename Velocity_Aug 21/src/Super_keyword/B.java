package Super_keyword;

public class B extends A
{
int a=100;

	public static void main(String[] args) 
	{
	B b=new B();
	b.display();
	

	}
	public void display()
	{
		int a=200;
		System.out.println("value of local variable a is "+a);
		System.out.println("Global variable  a from same class is "+this.a);
		System.out.println("Global variable a from super class is "+super.a);
	}

}
