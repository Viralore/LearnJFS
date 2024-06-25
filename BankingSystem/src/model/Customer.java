package model;

import java.time.LocalDate;
import java.util.List;

public class Customer 
{
	private String name;
	private String address;
	private LocalDate dob;
	private LocalDate dateOfCreation;
	private List<Account> accounts;
	private List<Transaction> transactions;
	private int custID;
	private String password;
	
	public Customer(String name, String address, LocalDate dob) 
	{
		super();
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.password = "changeme";
		this.dateOfCreation = LocalDate.now();
	}
	
	public Customer(String name, String address, LocalDate dob, String password) 
	{
		super();
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.password = password;
		this.dateOfCreation = LocalDate.now();
	}
	
	
	public Customer(String name, String address, LocalDate dob, LocalDate dateOfCreation, String password) 
	{
		super();
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.dateOfCreation = dateOfCreation;
		this.password = password;
	}

	public LocalDate getDateOfCreation() 
	{
		return dateOfCreation;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public LocalDate getDob() 
	{
		return dob;
	}

	public void setDob(LocalDate dob) 
	{
		this.dob = dob;
	}

	public int getCustID() 
	{
		return custID;
	}

	public void setCustID(int custID) 
	{
		this.custID = custID;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	
	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public void listAccounts()
	{
		for(Account acc : accounts)
		{
			System.out.println(acc);
		}
		System.out.println();
	}
	
	public void listTransaction()
	{
		for(Transaction transaction : transactions)
		{
			System.out.println(transaction);
		}
		System.out.println();
	}
	
	public void addTransaction(Transaction transaction)
	{
		transactions.add(transaction);
	}
	
	public void addAccount(Account account)
	{
		accounts.add(account);
	}
	
	public void deleteAccount(long accountNumber)
	{
		accounts.removeIf((x) -> x.getAccountNumber()==accountNumber);
	}
	
}
