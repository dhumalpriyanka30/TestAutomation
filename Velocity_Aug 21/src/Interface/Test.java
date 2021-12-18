package Interface;

public class Test implements Mother1 {

	public static void main(String[] args)
	{
		Test t =new Test();
		t.look();
		t.recipe();
		t.key();
		t.stories();
	}

	@Override
	public void key()
	{
		System.out.println("Grandmother key");
	}

	@Override
	public void stories() 
	{
		System.out.println(" GrandMother stories");
		
	}

	@Override
	public void look() 
	{
		System.out.println("Mother look");
	}

	@Override
	public void recipe()
	{
		System.out.println(" Mother recipe");
	}

}
