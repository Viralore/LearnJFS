package service;

import java.time.LocalDate;

import dao.AccountDAO;
import dao.AccountDAOImpl;
import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import dao.OfficialDAO;
import dao.OfficialDAOImpl;
import dao.TransactionDAO;
import dao.TransactionDAOImpl;
import generator.Generator;
import model.Account;
import model.Customer;
import model.FixedAccount;
import model.Official;
import model.SavingAccount;
import model.Transaction;

public class BankingServiceImpl implements BankingService 
{
	CustomerDAO customerDAO = new CustomerDAOImpl();
	TransactionDAO transactionDAO = new TransactionDAOImpl();
	OfficialDAO officialDAO = new OfficialDAOImpl();
	AccountDAO accountDAO = new AccountDAOImpl();
	
	@Override
	public Transaction transfer(long senderAccountNumber, long receiverAccountNumber, double amount) 
	{
		//Getting accounts
		Account sender = accountDAO.getAccount(senderAccountNumber);
		Account receiver = accountDAO.getAccount(receiverAccountNumber);
		
		//Getting customers 
		Customer senderC = customerDAO.getCustomerById(sender.getCustID());
		Customer receiverC = customerDAO.getCustomerById(receiver.getCustID());
		
		//checking
		if(sender == null || receiver  == null || senderC == null || receiverC == null) return null;
		if(sender.getBalance()<amount) throw new RuntimeException("Current Balance is not sufficient");
		
		//creating new transaction
		Transaction transaction = new Transaction(Generator.generateUniqueTransactionID(),senderAccountNumber,receiverAccountNumber,LocalDate.now(),amount);
				
		//updating the accounts
		sender.setBalance(sender.getBalance() - amount);
		receiver.setBalance(receiver.getBalance() + amount);
		
		//adding transaction
		senderC.addTransaction(transaction);
		receiverC.addTransaction(transaction);
		
		
		//updating the DAO's
		transactionDAO.addTransaction(transaction);
		accountDAO.updateAccount(sender);
		accountDAO.updateAccount(receiver);
		customerDAO.updateCustomer(senderC);
		customerDAO.updateCustomer(receiverC);
		
		return transaction;
	}

	@Override
	public Customer addCustomer(Customer customer) 
	{
		customerDAO.addCustomer(customer);
		return customer;
	}

	@Override
	public boolean deleteCustomer(int customerId) 
	{
		if(customerDAO.getCustomerById(customerId) != null)
		{
			customerDAO.deleteCustomer(customerId);
			return true;
		}
		return false;
	}

	@Override
	public Official updateOfficialDetails(String name, String password, String role,int officialID) 
	{
		if(officialDAO.getOfficialById(officialID) == null) throw new RuntimeException("Employee not exists"); 
		Official official = new Official(name,password,role);
		officialDAO.updateOfficial(official);
		return official;
	}

	@Override
	public Official updateOfficialDetails(String name, String password,int officialID) 
	{
		if(officialDAO.getOfficialById(officialID) == null) throw new RuntimeException("Employee not exists"); 
		Official official = new Official(name,password);
		officialDAO.updateOfficial(official);
		return official;
	}

	@Override
	public Customer updateCustomerDetails(String name, String address, LocalDate dob, String password, int custID) 
	{
		Customer temp = customerDAO.getCustomerById(custID);
		if(temp == null) throw new RuntimeException("No customer exists");
		Customer customer = new Customer(name,address,dob,temp.getDateOfCreation(),password);
		
		customerDAO.updateCustomer(customer);
		
		return customer;
	}

	@Override
	public Account addSavingAccount(int customerId, double initialBalance) 
	{
		Customer customer = customerDAO.getCustomerById(customerId);
		if(customer == null) throw new RuntimeException("No customer exists");
		Account account = new SavingAccount(customer.getName(),Generator.generateUniqueAccountNumber(),initialBalance,4.7,LocalDate.now(),customer.getCustID());
		customer.addAccount(account);
		customerDAO.updateCustomer(customer);
		accountDAO.updateAccount(account);
		return account;
	}
	
	

	@Override
	public Account addFixedAccount(int customerId, double initialBalance, LocalDate maturityDate) 
	{
		Customer customer = customerDAO.getCustomerById(customerId);
		if(customer == null) throw new RuntimeException("No customer exists");
		Account account = new FixedAccount(customer.getName(),Generator.generateUniqueAccountNumber(),initialBalance,12.7,LocalDate.now(),maturityDate,customer.getCustID());
		customer.addAccount(account);
		customerDAO.updateCustomer(customer);
		accountDAO.updateAccount(account);
		return account;
	}

	@Override
	public boolean deleteAccount(long accountNumber) 
	{
		Account account = accountDAO.getAccount(accountNumber);
		if(account != null)
		{
			Customer customer = customerDAO.getCustomerById(account.getCustID());
			customer.deleteAccount(accountNumber);
			customerDAO.updateCustomer(customer);
			accountDAO.deleteAccount(accountNumber);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteOfficial(int officialId) 
	{
		if(officialDAO.getOfficialById(officialId) != null)
		{
			officialDAO.deleteOfficial(officialId);
			return true;
		}
		return false;
	}

	@Override
	public void viewAccount(long accountNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewAllAccounts() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewAllAccounts(int customerId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewTransaction(long transactionId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewAllTransactions() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewTransactionsOfCustomer(int customerId) {
		// TODO Auto-generated method stub

	}

}
