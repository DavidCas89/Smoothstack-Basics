import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class AppendText 
{
	public static void main(String[] args)
	{
		System.out.println("File Appender\nFile Dir:");
        Scanner scanAppend = new Scanner(System.in);
        String fileDir = scanAppend.nextLine();
        
        System.out.println("Append to end of File:\n");
        String appendTxt = scanAppend.nextLine();
        try
        {
        	Files.write(Paths.get(fileDir), (System.lineSeparator()+appendTxt).getBytes(), StandardOpenOption.APPEND);
        	System.out.println("Done Appending\n\nFile:");
        	FileReader file = new FileReader(fileDir);
        	BufferedReader fileBuffer = new BufferedReader(file);
        	String bufferedtxt;
        	while( (bufferedtxt = fileBuffer.readLine()) != null)
        	{
        		System.out.println(bufferedtxt);
        	}
        	fileBuffer.close();
        	scanAppend.close();
        	
        } 
        catch(Exception e)
        {
        	System.out.println("Error in locating File\n ");
        }
	}

}
