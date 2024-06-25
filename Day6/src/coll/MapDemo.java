package coll;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student
{
	String name,branch;
	int roll;
	public Student(String name, String branch, int roll) 
	{
		super();
		this.name = name;
		this.branch = branch;
		this.roll = roll;
	}
	
	@Override
	public String toString() 
	{
		return " [name = " + name + ", branch = " + branch + ", roll = " + roll + "]";
	}
}

public class MapDemo 
{
	public static Map<Character,Integer> frequency(String word)
	{
		Map<Character,Integer> freq = new HashMap<>();
		for(int i=0;i<word.length();i++)
		{
			if(freq.containsKey(word.charAt(i))) freq.put(word.charAt(i), freq.get(word.charAt(i))+1);
			else freq.put(word.charAt(i),1);
		}
		return freq;
	}
	
	public static boolean canBeMadePalindrome(String word)
	{
		Map<Character,Integer> mp = frequency(word);
		Collection<Integer> value = mp.values();
//		System.out.println(value);
		
		int oddCount=0;
		for(int i : value)
		{
			if(i%2 != 0) oddCount++;
			if(oddCount > 1) return false;
		}
		
		return true;
	}
	
	public static Map<Integer,Student> getStudents(int n,Scanner in)
	{
		Map<Integer,Student> mp = new HashMap<>();
		String name,branch;
		int roll;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter roll no : ");
			roll = in.nextInt();
			in.nextLine();	
			System.out.print("Enter name : ");
			name = in.nextLine();
			System.out.print("Enter branch : ");
			branch = in.nextLine();
			
			mp.put(roll,new Student(name,branch,roll));
		}
		return mp;
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the no of students : ");
		int n = in.nextInt();
		Map<Integer,Student> mp = getStudents(n,in);
		System.out.println(mp);
		
		System.out.print("Enter the word : ");
		String word = in.nextLine();
		Map<Character,Integer> freq = frequency(word);
		System.out.println("Frequency : "+freq);
		
		System.out.print("Enter the word to check : ");
		word = in.next();
		if(canBeMadePalindrome(word)) System.out.println("Yes, can be made into Palindrome");
		else System.out.println("No, can't be made into Palindrome");
		
		in.close();
	}

}
