package exceptiondemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("serial")
class NumberNotFoundException extends Exception
{
	public NumberNotFoundException(String str) 
	{
		System.out.println(str);
	}
}

public class ExceptionDemo 
{
	
	public static void f1()
	{
		f2();
	}
	
	
	public static void f2() 
	{
		f3();
	}
	public static void f3() 
	{
		f4();
	}
	public static void f4() 
	{
		throw new RuntimeException();
	}


	public static int find(int a[],int x) throws NumberNotFoundException
	{
		int index = -1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				index = i;
			}
		}
		if(index == -1) throw new NumberNotFoundException("Given number is not present in the array");
		return index;
	}
	
	public static void readFile(String fileName) throws IOException, FileNotFoundException //checked exception
	{
		FileReader fr = new FileReader(fileName);
		int ch = 0;
		while(ch != -1)
		{
			ch = fr.read();
			System.out.print( (char)ch );
		}
		fr.close();
	}
	
	public static void main(String[] args) throws NumberNotFoundException,IOException, FileNotFoundException
	{
		Scanner in = null;
		try
		{
			f1();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
//		try
//		{
//			in = new Scanner(System.in);
//			int[] a = {1,2,3,4,5};
//			System.out.print("Enter an index : ");
//			int index = in.nextInt();
//			System.out.println(a[index]);
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		finally
//		{
//			in.close();
//		}
		
		try
		{
			in = new Scanner(System.in);
			int[] arr = {1,2,3,4,5,6,7,8,9,10};
			int x = in.nextInt();
			
			int index = find(arr,x);
			System.out.println("index of x = "+ x +" : " + index);
		}
		catch(NumberNotFoundException e)
		{
			
		}
		finally
		{
			in.close();
		}
		
		try
		{
			readFile("../Day8/src/streamapi/StreamAPIDemo.java");  //current working directory is Day9
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("bye");
	}
}
