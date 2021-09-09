import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CountCharFile 
{
		public static void main(String[] args)
		{
			int charCount = 0;
			
			System.out.println("File To Count\nFile Dir:");
	        Scanner scanCount = new Scanner(System.in);
	        String fileDir = scanCount.nextLine();
	        
	        System.out.print("Character to Count:");
	        String charLook = scanCount.nextLine();
	        while(charLook.length() > 1)
	        {
	        	System.out.print("\nInvalid Entry only one character\nChar:");
	        	charLook = scanCount.nextLine();
	        }
	        char letter = charLook.charAt(0);
	        try
	        {
	        	FileReader file = new FileReader(fileDir);
	        	BufferedReader fileBuffer = new BufferedReader(file);
	        	String bufferedtxt;
	        	while( (bufferedtxt = fileBuffer.readLine()) != null)
	        	{
	        		for(int i =0; i < bufferedtxt.length(); i++)
	        		{
	        			if(letter == bufferedtxt.charAt(i) )
	        			{
	        				charCount++;
	        			}
	        		}
	        	}
	        	fileBuffer.close();
	        	scanCount.close();
	        	System.out.println("The number of instances of the character:"+letter+ " are "+charCount+" times inside file:"+fileDir);
	        } 
	        catch(Exception e)
	        {
	        	System.out.println("Error in locating File\n ");
	        }
	        

	}


}
