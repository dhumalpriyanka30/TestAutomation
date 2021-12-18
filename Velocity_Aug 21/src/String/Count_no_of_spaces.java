package String;

public class Count_no_of_spaces {

	public static void main(String[] args) {
	
		String s= "Priyanka  Shirke  ";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{  
		    char blank= ' ';
		
			if(blank==s.charAt(i))
			{
				count++;
			}
			
		}
System.out.println("count is "+count);
	}

}
