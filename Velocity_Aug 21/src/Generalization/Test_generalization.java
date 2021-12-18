package Generalization;

public class Test_generalization {

	public static void main(String[] args) 
	{
		Maruti m=new Maruti();
		System.out.println("==========Maruti===========");
		m.average();
		m.model_no();
		m.New_Maruti();
		m.speed();
		
		System.out.println();
		
		swift s =new  swift();
		System.out.println("==========Swift===========");
		s.average();
		s.model_no();
		s.new_swift();
		s.speed();
		System.out.println();
		
		
		tata_motors t=new tata_motors();
		System.out.println("==========tata===========");
		t.average();
		t.model_no();
		t.new_tata();
		t.speed();
		
	}

}
