package Method_Study;

public class studentinfo {

	public static void main(String[] args)
	
	{
		studentinfo s=new studentinfo();
		s.StudentData(101, "Ajay", 98.9f, 'A');
		
		System.out.println("---------------------->");
		s.StudentData(102, "Seema", 65.8f, 'A');
		// TODO Auto-generated method stub
		
		
		

	}
	
	
	
	public void StudentData(int RollNo, String Name,float Marks,char grade)
	{
	System.out.println("RollNo of student is "+RollNo);
	System.out.println("Name of student is "+ Name);
	System.out.println("Marks of student is "+Marks);
System.out.println("grade of student is  "+grade);

	}
}
