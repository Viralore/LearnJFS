package intf;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student>
{
	int roll;
	String name;
	int marks;
	
	public Student(int roll, String name, int marks)
	{
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Student [roll = " + roll + ", name = " + name + ", marks = " + marks + "]";
	}

	@Override
	public int compareTo(Student o) 
	{
		if(this.roll < o.roll) return -1;
		if(this.roll < o.roll) return -1;		
		return 0;
	}
	
}

class StudentMarksComparator implements Comparator<Student>
{

	@Override
	public int compare(Student arg0, Student arg1) 
	{
		return arg0.marks - arg1.marks;
	}
	
}

class StudentNameComparator implements Comparator<Student>
{
	@Override
	public int compare(Student s1,Student s2)
	{
		return s1.name.compareTo(s2.name);
	}
}

class StudentNameComparatorReverse implements Comparator<Student>
{
	@Override
	public int compare(Student s1,Student s2)
	{
		if(s1.name.compareTo(s2.name) > 0 ) return -1; 
		if(s1.name.compareTo(s2.name) < 0 ) return 1; 
		return 0;
	}
}

public class ComparableComparatorDemo 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student(123,"Sumit",34);
		Student s2 = new Student(127,"Kishor",32);
		Student s3 = new Student(124,"Geet",12);
		Student s4 = new Student(126,"Amit",44);
		
		Student[] arr = {s1, s2, s3, s4};
		
		Arrays.sort(arr);
		System.out.println("Comparing according to roll no");
		System.out.println(Arrays.toString(arr));
		StudentMarksComparator comparator = new StudentMarksComparator();
		Arrays.sort(arr,comparator);
		System.out.println("Comparing according to marks");
		System.out.println(Arrays.toString(arr));
		
		StudentNameComparator comparator1 = new StudentNameComparator();
		Arrays.sort(arr,comparator1);
		System.out.println("Comparing according to name");
		System.out.println(Arrays.toString(arr));
		
		//StudentNameComparatorReverse comparator2 = new StudentNameComparatorReverse();
		Arrays.sort(arr,comparator1.reversed());
		//Arrays.sort(arr,comparator2);
		System.out.println("Comparing according to name (reverse)");
		System.out.println(Arrays.toString(arr));
		
		Comparator<Student> comp = (o1,o2) -> o1.marks - o2.marks;
		Arrays.sort(arr,comp);
		System.out.println("Comparing according to marks");
		System.out.println(Arrays.toString(arr));
	}

}
