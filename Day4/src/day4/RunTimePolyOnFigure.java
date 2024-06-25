package day4;

public class RunTimePolyOnFigure 
{
	public static double sum(Figure f1, Figure f2)
	{
		return f1.area() + f2.area();
	}
	
	public static double sum(double d1, double d2) {return d1 + d2;}
	public static double sum(double d1, double d2, double d3) {return d1 + d2 + d3;}
	
	public static double sum(Figure[] arr)
	{
		double sumTemp = 0;
		for(int i=0;i<arr.length;i++)
			sumTemp += arr[i].area();
		
		return sumTemp;
	}
	
	
	public static void main(String[] args) 
	{
		Figure f1 = new Figure();
		Figure f2 = new Figure();
		
		Rectangle r1 = new Rectangle(5,3);
		Rectangle r2 = new Rectangle(5,4);
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(4);
		
		System.out.println(f1.area());
		System.out.println(r1.area());
		System.out.println(c1.area());
		
		f2 = r1; System.out.println(f2.area());	//run time polymorphism
		f2 = c1; System.out.println(f2.area()); //run time polymorphism
		
		System.out.println(sum(3.5, 6.7));		//compile time polymorphism
		System.out.println(sum(3.5, 6.7, 8.9));	//compile time polymorphism
		
		System.out.println("Sum = " + sum(f1,f2));	//run time polymorphism
		System.out.println("Sum = " + sum(r1,r2));	//run time polymorphism
		System.out.println("Sum = " + sum(c1,c2));	//run time polymorphism
		System.out.println("Sum = " + sum(r1,c2));	//run time polymorphism
		System.out.println("Sum = " + sum(c1,r2));	//run time polymorphism
		
		Figure[] arr = new Figure[5];
		
		arr[0] = new Figure();
		arr[1] = new Rectangle(5,9);
		arr[2] = new Rectangle(6,8);
		arr[3] = new Circle(12);
		arr[4] = new Circle(7);
		
		System.out.println("Sum of array of Figures : " + sum(arr));
	}

}
