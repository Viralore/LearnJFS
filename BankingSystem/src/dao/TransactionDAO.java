package dao;

import model.Transaction;
import java.util.List;

public interface TransactionDAO 
{
    boolean addTransaction(Transaction transaction);

    Transaction getTransactionById(long transactionId);
    List<Transaction> getAllTransactions();   
}
