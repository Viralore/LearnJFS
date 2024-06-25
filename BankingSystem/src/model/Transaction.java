package model;

import java.time.LocalDate;

public class Transaction 
{
	private long transactionId;
    private long senderAccountNumber;
    private long receiverAccountNumber;
    private LocalDate transactionDate;
    private double amount;
    
	public Transaction(long transactionId, long senderAccountNumber, long receiverAccountNumber,
			LocalDate transactionDate, double amount) {
		super();
		this.transactionId = transactionId;
		this.senderAccountNumber = senderAccountNumber;
		this.receiverAccountNumber = receiverAccountNumber;
		this.transactionDate = transactionDate;
		this.amount = amount;
	}

	public long getTransactionId() 
	{
		return transactionId;
	}

	public void setTransactionId(long transactionId) 
	{
		this.transactionId = transactionId;
	}

	public long getSenderAccountNumber() 
	{
		return senderAccountNumber;
	}

	public void setSenderAccountNumber(long senderAccountNumber) 
	{
		this.senderAccountNumber = senderAccountNumber;
	}

	public long getReceiverAccountNumber() 
	{
		return receiverAccountNumber;
	}

	public void setReceiverAccountNumber(long receiverAccountNumber) 
	{
		this.receiverAccountNumber = receiverAccountNumber;
	}

	public LocalDate getTransactionDate() 
	{
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) 
	{
		this.transactionDate = transactionDate;
	}

	public double getAmount() 
	{
		return amount;
	}

	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
	
	@Override
	public String toString() 
	{
	    return "Transaction {" +
	           "transactionId=" + transactionId + 
	           ", senderAccountNumber=" + senderAccountNumber + 
	           ", receiverAccountNumber=" + receiverAccountNumber + 
	           ", transactionDate=" + transactionDate + 
	           ", amount=" + amount + 
	           "}";
	}

	
}
