
public class Circle {
	private int rad;
	Circle(int radius)
	{
		rad = radius;
	}
	
	public double calculateArea()
	{
		return Math.PI*(rad*rad);
	}
	
	public void display()
	{
		System.out.println("This is a Circle with radius: "+rad
				+" Area: "+ calculateArea());
	}

}
