package Generalization;

public class Maruti  implements Car
{

	@Override
	public void speed() 
	{
		System.out.println("speed of maruti car is 5km/m");
		
	}

	@Override
	public void average() {
		System.out.println("average of maruti car is 30km/hr");
	}

	@Override
	public void model_no() {
		System.out.println("model_no of maruti car is M1087");
	}
    public void New_Maruti()
    {
    	System.out.println("Maruti new methods");
    }
    
}
