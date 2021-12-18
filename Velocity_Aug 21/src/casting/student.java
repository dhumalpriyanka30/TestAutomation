package casting;

public class student  extends principle
{
	public void  learn()
	{
		System.out.println("student come for college for learning");
		
	}
	public void member()  //override
	{
		System.out.println("student is member of college");
		
	}
	
	public void id()
	{
		System.out.println("student must have id");
	}
	
public void rules()
{
	System.out.println("student have to follow rules");
}
}
