package day2;

public class GarbageCollectionDemo 
{
	public static void main(String[] args) 
	{
		Student student1 = new Student();
		student1.name = "Gopal";
		student1.roll = 34;
		student1.branch = "CSE";
		
		Student student2 = new Student();
		student2.name = "Abhishek";
		student2.roll = 16;
		student2.branch = "CSE";
		
		student1 = student2;
		
		System.gc();
		
	}

}
