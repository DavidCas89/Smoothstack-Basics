import java.util.List;



import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


class SampleSingleton 
{

	private static Connection conn = null;
	
	private static SampleSingleton instance = null; //Fixed this
	
	public static SampleSingleton getInstance() 
	{
		if(instance == null)
		{
			synchronized(instance)
			{
				if(instance == null)
					instance = new SampleSingleton();
			}
		}
		return instance;
	}
	
}


public class Assignment2 
{
	
	private List<Integer> rightDigit(List<Integer> nums) 
	{
		  nums.replaceAll(n -> n%10);
		  return nums;
	}
	
	private List<Integer> doubling(List<Integer> nums) 
	{
		  nums.replaceAll(n -> n*2);
		  return nums;
	}
	
	private List<String> noX(List<String> strings) 
	{
		strings.replaceAll(n -> n.replace("x", ""));
		  return strings;
	}
	
	private boolean groupSumClump(int start, int[] nums, int target) 
	{
		if(start > nums.length)
		{
			if(target == 0)
				return true;
			return false;
		}
		
		int i = 1;
		while(start+i < nums.length && nums[start] == nums[start+i]) //[2,2,4,1] takes all 2
			i++;
		
		if(groupSumClump(start+i, nums, target - nums[start]*i) || groupSumClump(start+i, nums, target)) //Ignore the groups or take them
			return true;
		return false;
	
	}
	
	
	
	

}
