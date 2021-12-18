package casting;

public class up_casting {

	public static void main(String[] args) 
	{
	 student s=new student();
	 s.learn();
	 s.id();
	 s.member();
	 s.rules();
	 
	 principle p= new student();
	 p.head();
	 p.member(); //student member method
	 p.rules();  //student rule method
	 //p.learn();  not accessing the student method for casting/not common in both class
	}

}
