import java.util.Scanner;

public class addition 
{
	public static float getNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\n Number:");
		float num = 0;
	    try 
	    {
	    	num= scan.nextFloat();
	    }
	    catch (Exception e)
	    {
	    	System.out.println("\tNot Valid Entry");
	    	num = getNum();
	    }
	    return num;
	    
	}
	
	public static void main(String[] args)
	{
	    System.out.print(" Additon Calculator \n To End Enter 0 \n");
	    float num = getNum();
	    
	    float sum = 0f;
	    while(num != 0f)
	    {
	    	sum += num;
	    	num = getNum();
	    }
	    System.out.print("\n Sum: " + sum);   
	}
}
