package main;

import algo.StringAlgo;

public class Main 
{
	public static void main(String[] args) 
	{
		StringAlgo stringAlgo = new StringAlgo();
		
		String input = "Hello";
		String output = stringAlgo.shiftBy2Chars(input);
		System.out.println(output);
		
		input = "program";
		output = stringAlgo.shiftBy2Chars(input);
		System.out.println(output);
		
		input = "ab";
		output = stringAlgo.shiftBy2Chars(input);
		System.out.println(output);
		
		input = "a";
		output = stringAlgo.shiftBy2Chars(input);
		System.out.println(output);
		
	}
}
