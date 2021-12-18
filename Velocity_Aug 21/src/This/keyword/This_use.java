package This.keyword;

public class This_use 
{
	int a=20;
    int b=30;     //global variable
    static int c=40;
    
	public static void main(String[] args)
	{
    This_use t=new This_use();
    t.display();
    
    
    
	}
	
	public void display()
	{
		int a=80;
		int b=50;
		int d=90;
		System.out.println("value of a is "+a);
		System.out.println("value of global variable is "+this.a);
		System.out.println("value of b is "+b);
		System.out.println("value of global variable is "+this.b);
		System.out.println("value of a is "+c);
		System.out.println("value of global variable is "+this.c);
	}

}
