package day2;


public class Student 
{
	public String name;
	public int roll;
	public String branch;
	public int age;
	
	public static int nextRoll = 101;
	
	@Override
	public String toString() 
	{
		return "Student [name = " + name + ", roll = " + roll + ", branch = " + branch + ", age = " + age + "]";
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Student with name "+ name + " collected in garbage");
	}

	public Student() 
	{
		super();
		this.roll = nextRoll++;
	}

	public Student(String name, int roll, String branch) 
	{
		super();
		this.name = name;
//		this.roll = roll;
		this.roll = nextRoll++;
		this.branch = branch;
	}

	public Student(String name, int roll, String branch, int age) 
	{
		super();
		this.name = name;
//		this.roll = roll;
		this.roll = nextRoll++;
		this.branch = branch;
		this.age = age;
	}

	public void show()
	{
		System.out.println("Name : "+name+" ,age : "+age+" ,rollno : "+roll+" & Branch : "+branch);
	}
	
	public Student older(Student s)
	{
		/*
		 * if(this.age > s.age) return this;
		 * else return s;
		 */
		
		Student old = new Student();
		if(this.age>s.age) 
		{
			old.name = this.name;
			old.age = this.age;
			old.branch = this.branch;
			old.roll = this.roll;
		}
		else 
		{
			old.name = s.name;
			old.age = s.age;
			old.branch = s.branch;
			old.roll = s.roll;
		}
		return old;
	}
	
	public static int getNextRoll()
	{
		return nextRoll;
	}

}
