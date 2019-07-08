package com.wipro.service;

import java.util.List;

import com.wipro.model.Customer;
import com.wipro.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
		System.out.println("Default Constructor Invoked");
	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Constructor Injection");
		this.customerRepository = customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setter Injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
