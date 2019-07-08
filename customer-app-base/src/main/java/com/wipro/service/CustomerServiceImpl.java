package com.wipro.service;

import java.util.List;

import com.wipro.model.Customer;
import com.wipro.repository.CustomerRepository;
import com.wipro.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
