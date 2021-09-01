
public class Rectangle implements Shape{
	private int len, width;
	Rectangle(int length,int wid)
	{
		len = length;
		width = wid;
	}
	
	public double calculateArea()
	{
		return len*width;
	}
	
	public void display()
	{
		System.out.println("This is a Rectangle of Length: "+len+" Width:"+width
				+" Area: "+ calculateArea());
		
	}
}
