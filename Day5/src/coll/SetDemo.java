package coll;

/*
 * Set explanation and filtering the sentence
 * How to take input paragraph and terminate the input stream
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class SetDemo 
{
	public static void printDifferentCharacter(String word)
	{
		Set<Character> set = new HashSet<>();
		for(int i=0;i<word.length();i++)
		{
			set.add(word.charAt(i));
		}
		Iterator<Character> iterator = set.iterator();
		while(iterator.hasNext())
		{
			char c = iterator.next();
			System.out.print(c + " ");
		}		
		System.out.println();
	}
	
	public static void removeDuplicateAndCommonWords(List<String> arr)
	{
		Set<String> commonWords = new HashSet<>();
		commonWords.add("is"); commonWords.add("am"); commonWords.add("are"); commonWords.add("have");
		commonWords.add("has"); commonWords.add("this"); commonWords.add("that"); commonWords.add("and");
		commonWords.add("for"); commonWords.add("in"); commonWords.add("out"); commonWords.add("to");
		commonWords.add("it"); commonWords.add("we"); commonWords.add("get"); commonWords.add("after");
		
		Set<String> allWordsFiltered = new HashSet<>();
		for(int i=0;i<arr.size();i++)
		{
			String sentence = arr.get(i);
			String[] words = sentence.split(" ");
			for(String s : words)
			{
				if(!commonWords.contains(s)) allWordsFiltered.add(s);
			}
		}
		
		Iterator<String> iterator = allWordsFiltered.iterator();
		
		System.out.print("Filtered sentence : ");
		while(iterator.hasNext())
		{
			String str = iterator.next();
			System.out.print(str + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		
//		Set<Integer> set = new HashSet<>();
//		Set<Integer> set = new TreeSet<>();
//		/*
//		 * {1,2,3}={3,2,1}
//		 * Repetition not allowed
//		 * List is ordered collection and set is unordered set
//		 */
//		
//		/*
//		 * Return type of add is boolean
//		 */
//		boolean added = set.add(23); System.out.println(added);
//		added = set.add(98); System.out.println(added);
//		set.add(53); set.add(54);
//		added = set.add(23); System.out.println(added);
//		added = set.add(98); System.out.println(added);
//		System.out.println("Size : " + set.size());
//		
//		System.out.println(set);
//		
////		for(int i : set) System.out.print(i + " ");
//		
//		Iterator<Integer> iterator = set.iterator();
//		
//		while(iterator.hasNext())
//		{
//			int x = iterator.next();
//			System.out.print(x + " ");
//		}
//		System.out.println();
//		
		/*
		 * Read a string from console, find the number of different character used to create that string
		 * ostentatious
		 * 
		 * Read a line -> this is java for young guys
		 * 
		 * Remove all duplicate words and unnecessary words from this paragraph
		 * 
		 * This is java for young guys. it is secure, distributed object oriented programming. Java is compiled and interpreted.
		 * after compilation we get byte code and JVM is java interpreter that interprets this code.
		 * 
		 * Unnecessary words : 
		 */
		Scanner in = new Scanner(System.in);
		//String word = in.nextLine();
//		String word = "ostentatious";
//		printDifferentCharacter(word);
//		word = "this is java for young guys.";
//		printDifferentCharacter(word);
//		word = "this is java for young guys. it is secure, distributed object oriented programming. Java is compiled and interpreted. after compilation we get byte code and JVM is java interpreter that interprets this code.";
		String word = " ";
		List<String> arr = new ArrayList<>();
		
		//Will terminate the input after user press empty string
		System.out.println("Enter the lines");
		while(in.hasNextLine() && !(word = in.nextLine()).equals(""))
		{
			arr.add(word);
		}
		removeDuplicateAndCommonWords(arr);
		in.close();
	}

}
