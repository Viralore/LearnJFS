package lambdademo;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo2 
{
	public static void main(String[] args) 
	{
		List<BankAccount> list = new ArrayList<>();
		list.add(new BankAccount(15000,12,"sbi0001234"));
		list.add(new BankAccount(20000,12,"sbi0001234"));
		list.add(new BankAccount(45000,13,"sbi0001235"));
		list.add(new BankAccount(100000,14,"sbi0001234"));
		list.add(new BankAccount(120000,15,"sbi0001234"));
		list.add(new BankAccount(3800,16,"sbi0001238"));
		
		list.forEach(t -> System.out.println(t.getAccno() +" : "+ t.getBalance()) );
		System.out.println();
		
		//keeping accounts having ifsc code sbi000123
//		list.removeIf( t -> !t.getIfsc().equals("sbi0001234") );
//		list.forEach(t -> System.out.println(t.getAccno() +" : "+ t.getBalance()) );
		
		System.out.println("Sorted using balance :");
		list.sort( (t1,t2) -> (int)(t1.getBalance() - t2.getBalance()) );
		list.forEach(System.out::println);
		System.out.println();
		System.out.println("Sorted using customer ID :");
		list.sort( (t1,t2) -> t1.getCustID() - t2.getCustID() );
		list.forEach(System.out::println);
	}
}
