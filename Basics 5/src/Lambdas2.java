import java.util.Scanner;


public class Lambdas2 
{
	interface PerformOperations
	{
		boolean check(int a);
	}
	
	private static PerformOperations isOdd()
	{
		return a -> a % 2 == 1;
		
	}
	
	private static PerformOperations isPrime()
	{
		return a -> 
		{
			for(int i = 2; i < a/2; i++)
				if(a % i == 0)
					return false;
			return true;
		};
		
	}
	
	private static PerformOperations isPalindrome()
	{
		return a -> 
		{
			String test = Integer.toString(a);
			String reverse = "";
			int midPoint = test.length() / 2;
			if(test.length() % 2 == 0)
			{
				for(int i = 0; i <  midPoint +1; i++)
				{
					if(test.charAt(i) != test.charAt(midPoint + i))
						return false;
				}
			}
			else
			{
				for(int i = 0; i <  midPoint; i++)
				{
					if(test.charAt(i) != test.charAt(midPoint + i))
						return false;
				}
			}
			return true;
			
		};
		
	}
	
	
	private static boolean check(Integer i, PerformOperations p)
	{
		return p.check(i);
	}
	
	
	
	public static void main(String[] args)
	{
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Number of Operations:");
		 int operationsNumbers = 0;
		 try 
		 {
			 operationsNumbers = scan.nextInt();
		 }
		 catch(Exception e)
		 {
			 System.out.print("Not Valid Entry");
		 }
		 Integer[] op = new Integer[operationsNumbers];
		 Integer[] numbers = new Integer[operationsNumbers];
		 try
		 {
			 for(int i = 0; i < operationsNumbers; i++)
			 {
				 System.out.print("\n"+(i+1)+") Operation:");
				 op[i] = scan.nextInt();
				 while(op[i] < 1 || op[i] > 3)
				 {
					 System.out.print("\n"+(i+1)+") Operation:");
					 op[i] = scan.nextInt();
				 }
				 System.out.print("\nNumber:");
				 numbers[i] = scan.nextInt();
				 
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.print("Not Valid Entry");
		 }
		 
		 System.out.println();
		 for(int i = 0; i < operationsNumbers; i++)
		 {
			 switch(op[i])
			 {
			 	case 1:
			 		 System.out.println( check(numbers[i],isOdd())?"Odd":"Even" );
			 		 break;
			 	case 2:
			 		System.out.println( check(numbers[i],isPrime())?"Prime":"Composite" );
			 		break;
			 	case 3:
			 		System.out.println( check(numbers[i],isPrime())?"Palindrome":"Not Palindrome" );
			 		break;
			 	
			 }
		 }
		 
		 
	}

}
