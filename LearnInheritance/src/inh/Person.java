package inh;

public class Person 
{
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.age = age;
		this.name = name;
	}
	
	public void show()
	{
		System.out.println("Name : " + name + " , Age : " + age);
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Object of Person Class collected into garbage");
	}
	
	
}
