
public class Main 
{
	public static void main(String[] args)
	{
		addition add = new addition();
		addition.main(args);
		
		Array2D arr = new Array2D();
		arr.main(args);
		
		Rectangle rec = new Rectangle(10,10);
		rec.display();
		
		Circle circ = new Circle(10);
		circ.display();
		
		Triangle tri = new Triangle(5,10);
		tri.display();
	}

}
