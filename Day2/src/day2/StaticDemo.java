package day2;

public class StaticDemo 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student("Dinesh",23,"CSE",45);
		Student s2 = new Student("Piyush",24,"IT",20);
		
		//s1.nextRoll = 201; //Bad Code
		//Student.nextRoll = 301; //Good Code
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(Student.getNextRoll());
	}

}
