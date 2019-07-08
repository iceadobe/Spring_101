package com.wipro.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import com.wipro.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer me = new Customer("Himalaya", "Ghimire");
		customers.add(me);
		
		return customers;
	}
}
