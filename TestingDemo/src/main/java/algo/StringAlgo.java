package algo;

public class StringAlgo 
{
	// an algo that shifts first 2 characters of the string to the last
	// Input -> non null String
	// if String length is < 2, return the input string back
	// if String length is < 2, throws StringOutBoundsException
	// else if returns a string with first two chars replaced at last
	
	// hello -> llohe
	//program -> ogrampr
	//sumit -> mitsu
	
	// Test it for 3 Conditions
	/*
	 * 1 -> Normal
	 * 2 -> Boundary Values test it for 0, 1 or 100
	 * 3 -> Test it for exceptional conditions 0, null, required length, less than required length or more than required length
	 */
	public String shiftBy2Chars(String str)
	{
		//My logic
		int length = str.length();
		if(length <= 0) throw new RuntimeException();
		char[] charArray = str.toCharArray();
		
		for(int i=0;i<2;i++)
		{
			char temp = charArray[0];
			for(int j=0;j<length-1;j++)
			{
				charArray[j] = charArray[j+1];
			}
			charArray[length-1] = temp;
		}
		String string = String.valueOf(charArray);
		return string;
		//Sir's logic
		/*
		 * String start2 = str.substring(0,2);
		 * String end = str.substring(2);
		 * String ans = end + start2;
		 * return ans;
		 */
	}
	
	public static void main(String[] args) 
	{
		StringAlgo test = new StringAlgo();
		System.out.println(test.shiftBy2Chars("a"));
	}
}
