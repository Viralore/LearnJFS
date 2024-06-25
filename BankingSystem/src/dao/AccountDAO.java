package dao;

import java.util.List;

import model.Account;

public interface AccountDAO 
{
	boolean addAccount(Account account);
	boolean deleteAccount(long accountNumber);
	List<Account> listAccount();
	
	Account getAccount(long accountNumber);
	
	boolean updateAccount(Account account);
}
