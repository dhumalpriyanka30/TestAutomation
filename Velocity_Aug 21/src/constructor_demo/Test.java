package constructor_demo;

public class Test

{
	
	int RollNo;
	String Name;
	
 public Test(int rollnum,String name)
 {
	RollNo=rollnum;
	Name=name;
	
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t=new Test(101,"Ram");
System.out.println("Roll Number is " +t.RollNo);
System.out.println("name is " +t.Name);
	}

}
