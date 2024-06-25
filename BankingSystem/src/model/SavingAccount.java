package model;

import java.time.LocalDate;

public class SavingAccount extends Account 
{

	public SavingAccount(String name, long accountNumber, double balance, double interestRate, LocalDate openingDate, int custID) 
	{
		super(name, accountNumber, balance, interestRate, openingDate, custID);
	}

	
	@Override
	public double calculateInterest() 
	{
		double interest = getBalance() * (getInterestRate() / 100);
		return interest;
	}
	
	
	
}
