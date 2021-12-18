package Loop;


	import java.util.*;

	class calculator
	{
		public static void main(String a[])
		{
			
			int num1=0,num2=0,choice,ex;
			do
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your choice :");
				System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
				choice = sc.nextInt();
				if(choice!=5){
					System.out.println("Enter the first number");
					num1=sc.nextInt();
					System.out.println("Enter the second number");
					num2=sc.nextInt();
				}
				else
					break;
				switch(choice)
				{
		case 1:System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
						break;
		case 2:System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
						break;
		case 3:System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
						break;
		case 4:	
						System.out.println("Divison of "+num1+" and "+num2+" is " +(num1/num2));
						break;
		case 5: break;
					default: System.out.println("Invalid choice");
				}
				System.out.println("Do you want to continue?1.Yes 2.No");
				ex=sc.nextInt();
			}while(ex==1);
		}
	}
	