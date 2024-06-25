package generator;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Generator 
{
	private static final Random random = new Random();
	
	private static final int ACCOUNT_NUMBER_LENGTH = 11;
    private static final Set<Long> generatedAccountNumbers = new HashSet<>();
    
    private static final int CUSTOMER_ID_LENGTH = 7;
    private static final Set<Integer> generatedCustomerID = new HashSet<>();

    private static final int OFFICIAL_ID_LENGTH = 5;
    private static final Set<Integer> generatedOfficialID = new HashSet<>();
    
    private static final int TRANSACTION_ID_LENGTH = 13;
    private static final Set<Long> generatedTransactionID = new HashSet<>();
    
    
    public static long generateUniqueAccountNumber() 
    {
        long accountNumber;
        do 
        {
            accountNumber = generateRandomAccountNumber();
        } while (generatedAccountNumbers.contains(accountNumber));
        generatedAccountNumbers.add(accountNumber);
        return accountNumber;
    }

    private static long generateRandomAccountNumber() 
    {
        StringBuilder accountNumberBuilder = new StringBuilder();
        for (int i = 0; i < ACCOUNT_NUMBER_LENGTH; i++) 
        {
            int digit = random.nextInt(10); // Generate a random digit between 0 and 9
            accountNumberBuilder.append(digit);
        }
        return Long.parseLong(accountNumberBuilder.toString());
    }
    
    public static int generateUniqueCustomerID() 
    {
        int customerID;
        do 
        {
            customerID = generateRandomCustomerID();
        } while (generatedCustomerID.contains(customerID));
        generatedCustomerID.add(customerID);
        return customerID;
    }
    
    private static int generateRandomCustomerID() 
    {
        StringBuilder customerIDBuilder = new StringBuilder();
        for (int i = 0; i < CUSTOMER_ID_LENGTH; i++) 
        {
            int digit = random.nextInt(10); // Generate a random digit between 0 and 9
            customerIDBuilder.append(digit);
        }
        return Integer.parseInt(customerIDBuilder.toString());
    }
    
    public static int generateUniqueOfficialID() 
    {
        int officialID;
        do 
        {
        	officialID = generateRandomOfficialID();
        } while (generatedOfficialID.contains(officialID));
        generatedOfficialID.add(officialID);
        return officialID;
    }
    
    private static int generateRandomOfficialID() 
    {
        StringBuilder officialIDBuilder = new StringBuilder();
        for (int i = 0; i < OFFICIAL_ID_LENGTH; i++) 
        {
            int digit = random.nextInt(10); // Generate a random digit between 0 and 9
            officialIDBuilder.append(digit);
        }
        return Integer.parseInt(officialIDBuilder.toString());
    }
    
    public static long generateUniqueTransactionID() 
    {
        long transactionID;
        do 
        {
        	transactionID = generateRandomTransactionID();
        } while (generatedTransactionID.contains(transactionID));
        generatedTransactionID.add(transactionID);
        return transactionID;
    }
    
    private static long generateRandomTransactionID() 
    {
        StringBuilder transactionIDBuilder = new StringBuilder();
        for (int i = 0; i < TRANSACTION_ID_LENGTH; i++) 
        {
            int digit = random.nextInt(10); // Generate a random digit between 0 and 9
            transactionIDBuilder.append(digit);
        }
        return Long.parseLong(transactionIDBuilder.toString());
    }
}