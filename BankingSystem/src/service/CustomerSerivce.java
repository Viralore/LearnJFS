package service;

import java.util.List;

import model.Customer;

public interface CustomerSerivce 
{
	boolean addCustomer(Customer customer);
    
    Customer getCustomerById(int customerId);
    List<Customer> getAllCustomers();
    
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(int customerId);
}
