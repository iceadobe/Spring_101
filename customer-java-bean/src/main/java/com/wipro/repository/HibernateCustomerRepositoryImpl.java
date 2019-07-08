package com.wipro.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wipro.model.Customer;

@Repository
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer me = new Customer("Himalaya", "Ghimire");
		customers.add(me);
		
		return customers;
	}
}
