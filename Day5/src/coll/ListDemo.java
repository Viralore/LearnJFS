package coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		/*
		 * 1. Print the repeated elements in the list
		 * 2. Remove all alternate element from the list 1 2 3 4 5 6 7 8 => 1 3 5 7
		 * 3. Remove all repeated elements from the list so that each element is only once 
		 *    1 2 3 2 3 4 5 6 7 7 => 1 2 3 4 5 6 7
		 */
		
		/*
		 * List of ways to sort
		 * 1. list.sort((a,b) -> a-b);
		 * 2. Collections.sort(list);
		 */
		
		list.add(1); list.add(2); list.add(3); list.add(2); list.add(3);
		list.add(4); list.add(5); list.add(6); list.add(7); list.add(7);
		//System.out.println(list);
		/*
		 * List of ways to print the list
		 * for(int i=0;i<list.size();i++) System.out.println(list.get(i));
		 * for(int i : list) System.out.println(i);
		 * list.forEach(x -> System.out.println(x));
		 */
		Consumer<Integer> var = (x) -> { 
			if(list.indexOf(x) != list.lastIndexOf(x)) System.out.print(x + " ");
		};
		
		list.forEach(var);
		System.out.println();
		
		List<Integer> list2 = new ArrayList<>();
		for(int i=1;i<=8;i++) list2.add(i);
		list2.removeIf(x -> {return list2.indexOf(x)%2!=0;});
		System.out.println(list2);
		
//		list.removeIf(x -> {return list.indexOf(x) != list.lastIndexOf(x);});
//		System.out.println(list);
		
	}
	
	
	public static String[] findSmallWords(String[] arr,int len)
	{
		int count=0;
		String[] smallWords = new String[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length() <= len) smallWords[count++] = arr[i];
		}
		return Arrays.copyOf(smallWords,count);
	}
	
	public static int indexOfWord(String[] arr,String word)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(word)) return i;
		}
		return -1;
	}
	
	public static void practiceMain(String[] args) 
	{
		String[] words = {"Java","DBMS","Interface","Class","List","Set"};
		String[] smallWords = findSmallWords(words,4);
		
		System.out.println(Arrays.toString(smallWords));
		
		String word = "Class";
		int index = indexOfWord(words,word);
		System.out.println("Index of word : " + word + " = " + index);
	}

}
