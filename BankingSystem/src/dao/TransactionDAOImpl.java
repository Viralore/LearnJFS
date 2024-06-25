package dao;

import model.Transaction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionDAOImpl implements TransactionDAO 
{
    private Map<Long, Transaction> map = new HashMap<>();

    @Override
    public boolean addTransaction(Transaction transaction) 
    {
    	long transactionID = transaction.getTransactionId();
    	if(map.containsKey(transactionID)) return false;
    	else
    	{
    		map.put(transaction.getTransactionId(), transaction);
    		return true;
    	}
    }

    @Override
    public Transaction getTransactionById(long transactionId) 
    {
        return map.get(transactionId);
    }

    @Override
    public List<Transaction> getAllTransactions() 
    {
        return new ArrayList<>(map.values());
    }
}
