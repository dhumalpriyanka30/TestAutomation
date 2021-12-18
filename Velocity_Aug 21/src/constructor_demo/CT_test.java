package constructor_demo;

public class CT_test 
{
int num;
float num2;
float num3;

public CT_test(int a,float b)
{
	num=a;
	num2=b;
	
}
public CT_test(int a,float b,float c)
{num=a;
num2=b;
num3=c;
	
	
}

public CT_test(float c,int d)
{
	num2=c;
	num3=d;
}
	public static void main(String[] args) 
	
	{
		
		CT_test c1=new CT_test(12,20.9f);// TODO Auto-generated method stub
        c1.display();
        CT_test c2=new CT_test(20.0f,10);
        c2.display();
        CT_test c3=new CT_test(20,10.0f,40.0f);
        c3.display();
        
	}
public void display()
{    
	float add = num+num2+num3;
	System.out.println("addition is "+add);
}
}
