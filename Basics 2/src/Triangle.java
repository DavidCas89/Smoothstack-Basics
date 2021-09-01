
public class Triangle 
{
	private int base,height;
	Triangle(int base,int height)
	{
		this.base = base;
		this.height = height;
		
	}
	
	public double calculateArea()
	{
		return (base*height)/2;
	}
	
	public void display()
	{
		System.out.println("This is a Circle with base: "+base+" Height:"+ height
				+" Area: "+ calculateArea());
	}

}
