package com.wipro.repository;

import java.util.List;
import java.util.ArrayList;

import com.wipro.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	private String dbUsername;
	
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	@Override
	public List<Customer> findAll(){
		System.out.println("dbUsername = " + dbUsername);
		List<Customer> customers = new ArrayList<>();
		
		Customer me = new Customer("Himalaya", "Ghimire");
		customers.add(me);
		
		return customers;
	}
}
