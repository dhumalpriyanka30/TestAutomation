package Method_Study;

public class pratice
{ 
	public int c=20;
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    pratice p= new pratice();
    p.add(3);
    int d= 10+p.add(5);
    System.out.println("addition is " + d);
    
    
	}

	
	public int add(int a)
	{
		System.out.println("addition is " +a);
		return a;
		
	}
}
