package com.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.model.Customer;
import com.wipro.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
//	 Member lever Auto wiring
//	@Autowired
	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Constructor Injection");
		this.customerRepository = customerRepository;
	}
	
//	Setter Injection with AutoWiring
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setter Injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
