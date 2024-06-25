package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("unused")
public abstract class Account 
{
	private String name;
	private long accountNumber;
	private double balance,interestRate;
	private LocalDate openingDate;
	
	private int custID;
	
	private List<Transaction> transactions = new ArrayList<>();
	
	public Account(String name, long accountNumber, double balance, double interestRate, LocalDate openingDate, int custID) 
	{
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		this.openingDate = openingDate;
		this.custID = custID;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public long getAccountNumber() 
	{
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) 
	{
		this.accountNumber = accountNumber;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	public double getInterestRate() 
	{
		return interestRate;
	}

	public void setInterestRate(double interestRate) 
	{
		this.interestRate = interestRate;
	}

	public LocalDate getOpeningDate() 
	{
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) 
	{
		this.openingDate = openingDate;
	}
	
	public int getCustID() 
	{
		return custID;
	}

	public void setCustID(int custID) 
	{
		this.custID = custID;
	}

	public abstract double calculateInterest();

	@Override
	public String toString() 
	{
	    return "Account {" +
	           "accountNumber=" + accountNumber + 
	           ", balance=" + balance + 
	           ", interestRate=" + interestRate + 
	           ", openingDate=" + openingDate + 
	           "}";
	}

	
	
}
