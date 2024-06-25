package day3;

import java.time.LocalDate;
import java.util.*;

//Arrays Class helps to fill the array, sort the array, create copy of array, binary search etc.


public class DayArray 
{
	public static int sumOfArray(int[] arr)
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		
		return sum;
	}
	
	public static double averageOfArray(int[] arr)
	{
		double avg = 0;
		int n = arr.length;
		for(int i=0;i<n;i++)
			avg+=arr[i];
		
		return avg/n;
	}
	
	public static void printGreaterThanPrevious(int[] arr,int n)
	{
		for(int i=1;i<n;i++)
		{
			if(arr[i]>arr[i-1]) System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void printGreaterThanBoth(int[] arr,int n)
	{
		boolean check = false;
		for(int i=1;i<n-1;i++)
		{
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
			{
				System.out.print(arr[i]+" ");
				check = true;
			}
 		}
		if(check) System.out.println("No element that is greater than previous and next element present");
		if(!check) System.out.println();
	}
	
	public static void readArray(int[] arr,int n,Scanner in)
	{
		System.out.print("Enter element : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
	}
	
	public static void dayBetweenDates(LocalDate d1,LocalDate d2)
	{
		//print the number of days b/w dates like 12 12 2023 - 1 3 2024
	}
	
	public static int[] positions(int[] arr,int a)
	{
		/*int count=0;
		int len = arr.length;
		for(int i=0;i<len;i++)
		{
			if(arr[i]==a) count++;
		}
		
		int[] position = new int[count];
		int y=0;
		
		for(int i=0;i<len;i++)
		{
			if(arr[i]==a)
			{
				position[y++] = i;
			}
		}
		return position;*/
		
		int n = arr.length;
		int index = 0;
		int[] position = new int[n];
		for(int i=0;i<n;i++)
		{
			if(arr[i] == a) position[index++] = i;
		}
		
		position = Arrays.copyOf(position, index);
		return position;
	}
	
	public static int[] returnPositions(int[] arr,int n,int a)
	{
		String temp = "";
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==a)
			{
				temp += Integer.toString(i);
			}
		}
		int[] position = new int[temp.length()];
		
		for(int i=0;i<position.length;i++)
		{
			
		}
		
		return position;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the size of the array : ");
		int n = in.nextInt();
		
		int[] arr = new int[n];
		readArray(arr,n,in);
		
		
		System.out.println("Sum of Array : " + sumOfArray(arr));
		System.out.println("Average of Array : " + averageOfArray(arr));
		
		printGreaterThanPrevious(arr,n);
		printGreaterThanBoth(arr,n);
		
		int[] ar = {3,1,5,1,7,1,9,10,1,1,1};
		int[] pos = positions(ar,1);
		System.out.println(Arrays.toString(pos));
		
		
		
		in.close();
	}
}
