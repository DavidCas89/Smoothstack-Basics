public class DeadLock 
{
	public static void main(String[] args)
	{
		String unit1 = "First";
		String unit2 = "Second";
		Runnable t1 = new Runnable() 
		{
			@Override
			public void run() 
			{
				try
				{
					synchronized(unit1)
					{
						Thread.sleep(100);
						synchronized(unit2)
						{
							System.out.print("Thread Two has "+unit2+" and "+unit1);
						}
					}
				}
				catch(Exception e)
				{
					
				}
			}
			
		};
		
		Runnable t2 = new Runnable() 
		{
			@Override
			public void run() 
			{
				try
				{
					synchronized(unit2)
					{
						Thread.sleep(100);
						synchronized(unit1)
						{
							System.out.print("Thread Two has "+unit2+" and "+unit1);
						}
					}
				}
				catch(Exception e)
				{
					
				}
			}
			
		};
		
		System.out.println("DeadLock Begin");
		new Thread(t1).start();
		new Thread(t2).start();
		System.out.println("DeadLock End");
	}

}
