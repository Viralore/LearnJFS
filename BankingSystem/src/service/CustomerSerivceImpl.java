package service;

import java.util.List;

import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import model.Customer;

public class CustomerSerivceImpl implements CustomerSerivce 
{
	CustomerDAO customerDAO = new CustomerDAOImpl();
	
	@Override
	public boolean addCustomer(Customer customer) 
	{
		return customerDAO.addCustomer(customer);
	}

	@Override
	public Customer getCustomerById(int customerId) 
	{
		return customerDAO.getCustomerById(customerId);
	}

	@Override
	public List<Customer> getAllCustomers() 
	{
		return customerDAO.getAllCustomers();
	}

	@Override
	public boolean updateCustomer(Customer customer) 
	{
		return customerDAO.updateCustomer(customer);
	}

	@Override
	public boolean deleteCustomer(int customerId) 
	{
		return customerDAO.deleteCustomer(customerId);
	}

}
