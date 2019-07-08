package com.wipro.repository;

import java.util.List;
import java.util.ArrayList;

import com.wipro.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer me = new Customer("Himalaya", "Ghimire");
		customers.add(me);
		
		return customers;
	}
}
