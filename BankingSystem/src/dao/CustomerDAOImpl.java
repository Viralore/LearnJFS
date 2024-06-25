package dao;

import model.Customer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerDAOImpl implements CustomerDAO 
{

    private Map<Integer, Customer> map = new HashMap<>();

    @Override
    public boolean addCustomer(Customer customer) 
    {
    	int custID = customer.getCustID();
    	if(map.containsKey(custID)) return false;
        {
        	map.put(customer.getCustID(), customer);
        	return true;
        }
    }

    @Override
    public Customer getCustomerById(int customerId) 
    {
        return map.get(customerId);
    }

    @Override
    public List<Customer> getAllCustomers() 
    {
        return new ArrayList<>(map.values());
    }

    @Override
    public boolean updateCustomer(Customer customer) 
    {
    	int custID = customer.getCustID();
    	if(map.containsKey(custID))
        {
    		map.put(customer.getCustID(), customer);
    		return true;
        }
    	return false;
    }

    @Override
    public boolean deleteCustomer(int custID) 
    {
    	if(map.containsKey(custID))
        {
    		map.remove(custID);
    		return true;
        }
    	return false;
    }
}
