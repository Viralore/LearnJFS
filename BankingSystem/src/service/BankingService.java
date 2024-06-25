package service;

import java.time.LocalDate;

import model.Account;
import model.Customer;
import model.Official;
import model.Transaction;

public interface BankingService 
{
    Transaction transfer(long senderAccountNumber, long receiverAccountNumber, double amount); // Customer-only method

    Customer addCustomer(Customer customer); // Official-only method
    boolean deleteCustomer(int customerId); // Official-only method

    Official updateOfficialDetails(String name, String password, String role,int officialID); // Branch manager method
    Official updateOfficialDetails(String name, String password, int officialID); // Official method
    Customer updateCustomerDetails(String name, String address, LocalDate dob,String password, int custID); // Common method

    Account addSavingAccount(int customerId, double initialBalance); // Common method
    Account addFixedAccount(int customerId, double initialBalance,LocalDate maturityDate); // Common method
    boolean deleteAccount(long accountNumber); // Common method

    boolean deleteOfficial(int officialId); // Branch manager method

    void viewAccount(long accountNumber); // Common method
    void viewAllAccounts(); // Official-only method
    void viewAllAccounts(int customerId); // Customer method

    void viewTransaction(long transactionId); // Common method
    void viewAllTransactions(); // Common method
    void viewTransactionsOfCustomer(int customerId); // Official-only method
}
