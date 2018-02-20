import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What are the two numbers you want to modify? ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
	System.out.println("Addition, Subtraction, Mulitplication, or Divison? ");
	System.out.println("Please choose your decision");
	int decision = scan.nextInt();
	
		
		if (decision==1)
		{
			System.out.println("Choosing Addition ");
			int operation1 = Addition(num1,num2);
			System.out.println("The result is " + operation1);
		}
		
		else if (decision ==2)
		{
			System.out.println("Choosing Subtraction ");
			int operation2 =Subtraction(num1,num2);
			System.out.println("The result is " + operation2);
		}
		
		else if (decision ==3)
		{
			System.out.println("Choosing Multiplication ");
			int operation3 = Multiplication(num1,num2);
			System.out.println("The result is " + operation3);
		}
		
		else if (decision==4)
		{
			System.out.println("Choosing Division ");
			int operation4 = Division(num1,num2);
			System.out.println("The result is "+operation4);
		}
		
	    else
	    {
	    	System.out.println("Error ");
	    }
	    
			
	}
	
	
		
		public static int Addition(int num1, int num2)
		{
			int Sum = (num1+num2);
			return Sum;
			
		}
		public static int Subtraction(int num1,int num2)
		{
			int Sub= (num1-num2);
			return Sub;
						
		}
		
		public static int Multiplication(int num1, int num2)
		{
			int Mul=num1*num2;
			
			return Mul;
		}
		public static int Division(int num1, int num2)
		{
			int Division= num1/num2;
			return Division;
			
		}
	}

