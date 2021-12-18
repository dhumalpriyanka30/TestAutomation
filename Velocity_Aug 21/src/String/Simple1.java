package String;

public class Simple1 {

	public static void main(String[] args) {
		String s1= "Priyanka";
		String p="Priyanka";
		String s2="Abhijit";
		String s3="";
		
		
		String s =new String ("priyanka");
		String s4=new String("Abhi");
		String s5= new String("priya");

		System.out.println(s1==s); //flase
		System.out.println(s1==p); //constant pool area -true
		System.out.println(s1.equals(s)); //true
		System.out.println(s4.charAt(3));  //3rd letter of abhi string
		System.out.println(s1.equalsIgnoreCase(s));  // upercase and lower case doesnt matter
		System.out.println(s4.toLowerCase());
		System.out.println(s5.toUpperCase());
		System.out.println(s.length());
		System.out.println(s.contains("priya"));
		System.out.println(s3.isEmpty());
		System.out.println(s5.startsWith("pri"));
		System.out.println(s5.endsWith("ya"));
		System.out.println(s2.substring(2));
		System.out.println(s.substring(3,6));
		System.out.println(s4.concat(s5));
		
		s3=s4.concat(s5); // s3 is emplty string
		System.out.println(s3);
		s3=s4+ "dhumal";
		System.out.println(s3);
		s3=s4.concat("Dhumal");
		System.out.println(s3);
		System.out.println(s.indexOf("y"));
		String s6="MY test";
		String s7="";
		String[] data=s6.split(s7);
		System.out.println(data[3]);
	
		}

}
