package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Account;

public class AccountDAOImpl implements AccountDAO 
{
	Map<Long,Account> map = new HashMap<>();
	
	@Override
	public boolean addAccount(Account account) 
	{
		long accountNumber = account.getAccountNumber();
		if(map.containsKey(accountNumber)) return false;
		else
		{
			map.put(accountNumber, account);
			return true;
		}
	}

	@Override
	public boolean deleteAccount(long accountNumber) 
	{
		if(map.containsKey(accountNumber)) 
		{
			map.remove(accountNumber);
			return true;
		}
		return false;
	}

	@Override
	public List<Account> listAccount() 
	{
		return new ArrayList<>(map.values());
	}

	@Override
	public Account getAccount(long accountNumber) 
	{
		return map.get(accountNumber);
	}

	@Override
	public boolean updateAccount(Account account) 
	{
		long accountID = account.getAccountNumber();
		if(map.containsKey(accountID))
		{
			map.put(accountID, account);
			return true;
		}
		return false;
	}
	
	

}
