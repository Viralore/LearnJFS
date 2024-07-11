package algo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringAlgoTest 
{
	String shared = ""; // if one test case changes the shared value, other test case must start from same value 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Runs before all the test cases: like new connection");
		System.out.println("db connection, dummy data insertion, login before  test");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Runs after all the test cases");
		System.out.println("disconnect network, close db connection");
		System.out.println("remove dummy data, logout...");
	}

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("Before every test case, it sets up some local shared data");
	}

	@After
	public void tearDown() throws Exception 
	{
		System.out.println("After every test case, resets the local shared data");
	}

	@Test
	public void test() 
	{
		//fail("Not yet implemented"); // generated by eclipse
		StringAlgo stringAlgo = new StringAlgo();
		
		String input = "Hello";
		String expected = "lloHe";
		String actual = stringAlgo.shiftBy2Chars(input);
		assertEquals(expected,actual);
		
	}
	
	//for testing whether algo runs within time limit or not
	@Test(timeout = 2000)
	public void test2() 
	{
		StringAlgo stringAlgo = new StringAlgo();
		
		String input = "ab";
		String expected = "ab";
		String actual = stringAlgo.shiftBy2Chars(input);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void test3() 
	{
		StringAlgo stringAlgo = new StringAlgo();
		
		String input = "a";
		String expected = "a";
		try
		{
			String actual = stringAlgo.shiftBy2Chars(input);
		}
		catch(Exception e)
		{
			if(e instanceof StringIndexOutOfBoundsException)
			{
				System.out.println("test case pass");
			}
			else 
			{
				fail("Exception is not type of StringOutOfBoundsException");
				return;
			}
		}
		//fail("No exception thrown");
		
	}

	// let say specifications say string less than length 2 must throw an exception
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void test4() 
	{
		StringAlgo stringAlgo = new StringAlgo();
		
		String input = "a";
		String expected = "a";
		String actual = stringAlgo.shiftBy2Chars(input);
	}
	
}
