package day4;

public class Circle extends Figure 
{
	double rad;

	public Circle(double rad) 
	{
		super();
		this.rad = rad;
	}
	
	public double area()
	{
		return Math.PI * rad * rad;
	}
	
}
