import java.util.LinkedList;

public class ConsumerProducer 
{
	public static void main(String[] args)
	{
		ProCon procon = new ProCon();
		Runnable t1 = new Runnable() 
		{
			@Override
			public void run() 
			{

					try
					{
						procon.produce();
					}
					catch(Exception e)
					{
						System.out.println("Error in Producer");
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
						procon.consume();
					}
					catch(Exception e)
					{
						System.out.println("Error in Consumer");
					}
				
			}
			
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
	}
		
		public static class ProCon
		{
			LinkedList<Integer> buffer = new LinkedList<Integer>();
			int limitBufferSize = 3;
			
			
			
		      public void produce() throws Exception
		        {
		            int value = 0;
		            while (true) {
		                synchronized (this)
		                {
		                    // producer thread waits while list
		                    // is full
		                    while (buffer.size() == limitBufferSize)
		                        wait();
		 
		                    System.out.println("Producer produced-"
		                                       + value);
		                    buffer.add(value++);
		                    notify();
		                    Thread.sleep(1000);
		                }
		            }
		        }
		 
		        // Function called by consumer thread
		        public void consume() throws Exception
		        {
		            while (true) {
		                synchronized (this)
		                {
		                    while (buffer.size() == 0)
		                        wait();
		                    int val = buffer.removeFirst();
		 
		                    System.out.println("Consumer consumed-"
		                                       + val);
		                    notify();
		                    Thread.sleep(1000);
		                }
		            }
		        }
		}
		

}
