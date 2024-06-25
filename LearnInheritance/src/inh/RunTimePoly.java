package inh;

public class RunTimePoly 
{

	public static void main(String[] args) 
	{
		Person p = new Person("Aman",21);
		Student s = new Student("Aryan",20,102,"CSE");
		
		p.show();
		s.show();
		
		p = s;
		System.gc();
		p.show();
	}

}
