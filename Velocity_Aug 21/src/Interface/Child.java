package Interface;

public class Child implements Father,Mother {

	public static void main(String[] args) {
		Child c= new Child();
		c.house();
		c.look();
		c.money();
		c.car();

	}

	@Override
	public void look()
	{
	System.out.println("Mother Look");
		
	}

	@Override
	public void recipe() 
	{
System.out.println("Mother recipe");
		
	}

	@Override
	public void house()
	{
   System.out.println("Father house");

	}

	@Override
	public void money()
	{
    System.out.println("Father money");
	
	}

	@Override
	public void car() 
	{
	
		Father.super.car();
		Mother.super.car();
	}

	

	

}
