package inh;

public class Student extends Person 
{
	private int roll;
	private String branch;
	
	public Student(String name, int age, int roll , String branch)
	{
		super(name,age);
		this.roll = roll;
		this.branch = branch;
	}
	
	public int getRoll() 
	{
		return roll;
	}

	public void setRoll(int roll) 
	{
		this.roll = roll;
	}

	public String getBranch() 
	{
		return branch;
	}

	public void setBranch(String branch) 
	{
		this.branch = branch;
	}

	public void show()
	{
		System.out.println("Name : " + getName() + " , Age : " + getAge() + " , Roll : " + roll + " & Branch : " + branch);
	}
}
