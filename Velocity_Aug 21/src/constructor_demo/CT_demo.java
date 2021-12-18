package constructor_demo;

public class CT_demo 
{ 
	int num1;
    int num2;
    int num3;
 public CT_demo()
 {
	 num1=10;
	 num2=20;
	 num3=39;
	 
 }
 public CT_demo( int b)
 {
 num2=b;
 
 }
 
 public CT_demo(int a, int c)
 {
	num1=a; 
	num3=c;
 }
 public CT_demo(int a,int b, int c)
 {
	num1=a;
	num2=b;
	num3=c;
 }

	public static void main(String[] args) 
	{
		
		CT_demo c1=new CT_demo();
		c1.addition();
		CT_demo c2=new CT_demo(100);
		c2.addition();
		CT_demo c3=new CT_demo(200,300);
		c3.addition();
		CT_demo c4=new CT_demo(400,500,600);
	    c4.addition();
		// TODO Auto-generated method stub

	}
public void addition()
{
	
	int sum=num1+num2+num3;
	System.out.println("addition is "+sum);
}
}
