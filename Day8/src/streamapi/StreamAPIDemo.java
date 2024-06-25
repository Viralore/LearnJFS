package streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo 
{
	public static boolean checkDivisibleBy2(List<Integer> list)
	{
		for(int i : list) if(i%2!=0) return false;
		return true;
	}
	
	public static boolean checkDivisibleBy5(List<Integer> list)
	{
		for(int i : list) if(i%5==0) return true;
		return false;
	}
	
	public static List<Integer> listLessThan50(List<Integer> list)
	{
		List<Integer> newList = new ArrayList<>();
		for(int i : list)
		{
			if(i < 50) newList.add(i);
		}
		return list;
	}
	
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(64);
		list.add(40);
		list.add(34);
		list.add(83);
		list.add(33);
		list.add(876);
		
		//Find max element of the list
		//check whether all numbers are divisible by 2 or not (return boolean)
		//check is there any number divisible by 5 return boolean
		//create new list of all the elements less than 50
		//remove all elements less than 50
		
		Integer maxElement = Collections.max(list);
		System.out.println("Maximum element in list : " + maxElement);
		
		Stream<Integer> stream = list.stream();
		Optional<Integer> min = stream.min((a,b) -> a-b);
		System.out.println("Min element : " + min.get());
		
		
//		if(checkDivisibleBy2(list)) System.out.println("Yes, all numbers in list are divisible by 2");
//		else System.out.println("No, not all numbers are divisible by 2");
		
//		boolean even = list.stream().allMatch(x -> x %2==0);
//		System.out.println("All even : " + even);
		
//		if(checkDivisibleBy5(list)) System.out.println("Yes, some numbers in list are divisible by 5");
//		else System.out.println("No, no number is divisible by 5");
		
		boolean matchAny = list.stream().anyMatch(x -> x%5==0);
		System.out.println("Any number divisible by 5 : " + matchAny);
		
//		List<Integer> newList = listLessThan50(list);
//		System.out.println("New List with elements less than 50 : " + newList);
		
		List<Integer> collect = list.parallelStream().filter(t -> t<50).collect(Collectors.toList());
		System.out.println("New List with elements less than 50 : " + collect);
		
//		list.removeIf(x -> x<50);
//		System.out.println(list);
		
		//check whether all students are passed or not for the given list of integers, min marks is 40
		boolean allPass = list.stream().allMatch(x -> x > 40);
		System.out.println("All pass : " + allPass);
		
//		Optional<Integer> maxMarksInFailed = list.stream().filter(t -> t<50).collect(Collectors.toList()).stream().max((a,b) -> a-b);
		Optional<Integer> max = list.stream().filter(t -> t<50).max((a,b) -> a-b); //Sir approach
		System.out.println("Max Marks in failed student marks : " + max.get());
		
	}
}
