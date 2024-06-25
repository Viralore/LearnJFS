package model;

import java.time.LocalDate;

public class FixedAccount extends Account 
{
	private LocalDate maturityDate;

	public FixedAccount(String name, long accountNumber, double balance, double interestRate, LocalDate openingDate,LocalDate maturityDate, int custID) 
	{
		super(name, accountNumber, balance, interestRate, openingDate, custID);
		this.maturityDate = maturityDate;
	}

	@Override
	public double calculateInterest() 
	{
		double interest = getBalance() * (getInterestRate() / 100);
		return interest;
	}

	public LocalDate getMaturityDate() 
	{
		return maturityDate;
	}

	public void setMaturityDate(LocalDate maturityDate) 
	{
		this.maturityDate = maturityDate;
	}
	
	
	
}
