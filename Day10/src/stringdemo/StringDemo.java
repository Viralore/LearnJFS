package stringdemo;

import java.util.ArrayList;
import java.util.List;

public class StringDemo 
{
	
	public static List<Integer> printPositions(String str, String word)
	{
		String strTemp = str.toLowerCase();
		String wordTemp = word.toLowerCase();
		List<Integer> list = new ArrayList<>();
		int index = 0;
		while(index != -1)
		{
			index = strTemp.indexOf(wordTemp, index+1);
			if(index != -1) list.add(index);
		}
		return list;
	}
	
	public static String convertDate(String date)
	{
		//split over - or .(\\.) 
		//trim
		
		String[] split = null;
		if(date.contains("-"))
		{
			split = date.split("-");
		}
		else if(date.contains("."))
		{
			split = date.split("\\.");
		}
		else throw new RuntimeException("No '.' or '-'");
		
		String day = split[0].trim();
		String month = split[1].trim();
		String year = split[2].trim();
		
		if(day.length() < 2) day = "0" + day;
		if(month.length() < 2) month = "0" + month;
		if(year.length() == 2) 
		{
			if(Integer.parseInt(year) > 24) year = "19" + year;
			else year = "20" + year;
		}
		
		return day + month + year;
	}
	
	public static String toTitle(String title)
	{
		String newTitle = "";
		String[] split = title.split(" ");
		
		for(String str : split)
		{
			newTitle = newTitle + str.substring(0,1).toUpperCase() +str.substring(1) + " ";
		}
		return newTitle.trim();
	}
	
	public static void main(String[] args) 
	{
		/*1. Print Positions
		 *String sentence = "this is line. Line contains few words. Line is in java"
		 *Positions of 'line' : 8, 14, 40
		 *
		 *2. Convert Date
		 *Input				output expected
		 *12 - 4-1978		12041978
		 *21.4.2001			21042001
		 *5-6-99			05061999
		 *04-11-01			04112001
		 *
		 *3. Convert a given string to title case:
		 *This is java lang -> This Is Java Lang
		 */
		
		String sentence = "this is line. Line contains few words. Line is in java";
		String word = "line";
		List<Integer> printPositions = printPositions(sentence, word);
		System.out.println(printPositions);
		
		String date = "12 - 4-1978";
		String newDate = convertDate(date);
		System.out.println(newDate);
		date = "21.4.2001";
		newDate = convertDate(date);
		System.out.println(newDate);
		date = "5-6-99";
		newDate = convertDate(date);
		System.out.println(newDate);
		
		String title = "I am Dinesh";
		String newTitle = toTitle(title);
		System.out.println("Title : " + newTitle);
		
	}
}
