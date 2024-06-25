package intf;

import java.util.function.*;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) 
	{
		Consumer<String> consumer = (String str) -> { System.out.println("Accepted the given string : '" + str + "'"); };
		
		consumer.accept("Hello");
		
		Predicate<String> predicate = (String str) -> {
			if(str.equals("Hello")) return true;
			return false;
		};
		
		boolean check = predicate.test("Hello");
		System.out.println(check);
		
		Function<String,Integer> function = (String a) -> {
			return a.length();
		};
		
		int ans = function.apply("hello");
		System.out.println("ans = " + ans);
		
	}

}
