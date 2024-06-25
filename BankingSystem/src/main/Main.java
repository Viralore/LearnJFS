package main;

import java.util.Scanner;

import generator.Generator;
import model.Official;
import service.BankingService;
import service.BankingServiceImpl;
import service.CustomerSerivce;
import service.CustomerSerivceImpl;
import service.OfficialService;
import service.OfficialServiceImpl;

@SuppressWarnings("unused")
public class Main 
{
	public static void main(String[] args) 
	{
		int choice = 0;
		
		BankingService bankingService = new BankingServiceImpl();
		CustomerSerivce customerService = new CustomerSerivceImpl();
		OfficialService officialService = new OfficialServiceImpl();
		
		Official official1 = new Official("Aman","pass","Manager");
		official1.setOfficialID(Generator.generateUniqueOfficialID());
		officialService.addOfficial(official1);
		System.out.println(official1.getOfficialID());
		
		Scanner in = new Scanner(System.in);
		boolean branchManagerLoggedIn = false;
		while(choice != 1)
		{
			System.out.println("1. Exit");
			System.out.println("2. Official Login");
			System.out.println("3. Customer Login");
			
			System.out.print("Enter your choice : ");
			choice = in.nextInt();
			
			switch(choice)
			{
				case 1:
					break;
				case 2:
					System.out.print("Enter Official ID : ");
					int id = in.nextInt();
					System.out.print("Enter Password    : ");
					String password = in.next();
					Official official = officialService.findOfficial(id, password);
					if(official == null)
					{
						System.out.println("Wrong ID or Password");
						break;
					}
					
					System.out.println("Welcome " + official.getName());
					int choice2 = 0;
					System.out.println("1. Exit");
					System.out.println("2. Add Customer");
					System.out.println("3. Add Account");
					System.out.println("4. Update your details");
					System.out.println("5. Update customer details");
					
					System.out.print("Enter your choice : ");
					choice2 = in.nextInt();
					
					switch(choice2)
					{
						case 1:
							break;
						case 2:
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
					}
					break;
				case 3:
					break;
				default:
					break;
			}
		}
		in.close();
	}
}
