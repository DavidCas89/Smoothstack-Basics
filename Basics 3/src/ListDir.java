import java.util.Scanner;
import java.io.File;
public class ListDir 
{
	private static void printDir(File[] dir, int indents) throws Exception
	{
	    for(int i = 0; i < dir.length; i++)
	    {
    	  for(int j = 0; j < indents; j++)
    		  System.out.print("\t");
    	  System.out.println(dir[i].getName());
    	  if(dir[i].isDirectory())
    	  {
    		  printDir(dir[i].listFiles(),indents+1);
    	  }
	    }
	}
	public static void main(String[] args)
	{
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Directory:");
	      String dir = scan.nextLine();
	      
	      File fileDir = new File(dir);
	      
	      
	      System.out.print("Directory List for "+dir+"\n");
	      scan.reset();
	      try {
			printDir(fileDir.listFiles(),0);
		} catch (Exception e) {
			System.out.println("Problem Accessing Dir");
		}
	    
	      
	}
}
