package Generalization;

public class swift implements Car
{

	@Override
	public void speed() {
		System.out.println("speed of swift is 3km/m");
		
	}

	@Override
	public void average() {
		// TODO Auto-generated method stub
		System.out.println(" average of swift is 60km/ltr");
	}

	@Override
	public void model_no() {
		// TODO Auto-generated method stub
		System.out.println("Model no of swift is M7859");
		
	}
	
	public void new_swift()
	{
		System.out.println("swift has new method");
	}
}

