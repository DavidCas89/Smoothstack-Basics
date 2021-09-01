import java.util.Random;

public class Array2D 
{
	public static void main(String[] args)
	{
		Random ran = new Random();
		
		int[][] array2D = new int[5][5];
		
		for(int i = 0; i < array2D.length; i++)
		{
			for(int j =0; j < array2D[i].length; j++)
				array2D[i][j]= ran.nextInt(100)+1;
			System.out.println();
		}
		
		int highest = 0,col=0, row = 0;
		for(int i = 0; i < array2D.length; i++)
		{
			for(int j =0; j < array2D[i].length; j++)
			{
				if(array2D[i][j] > highest)
				{
					highest = array2D[i][j];
					row = i;
					col = j;
				}
				System.out.print(array2D[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nHighest Value: "+highest+" located on ["+row+","+col+"]");
		
	}
}
