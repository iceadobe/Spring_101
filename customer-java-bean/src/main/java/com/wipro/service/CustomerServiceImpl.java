package com.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.model.Customer;
import com.wipro.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository1;

//	public CustomerServiceImpl() {}
	
//	public CustomerServiceImpl(CustomerRepository customerRepository) {
//		System.out.println("Constructor Injection");
//		this.customerRepository = customerRepository;
//	}
	
//	Setter Injection with AutoWiring
//	@Autowired
//	public void setCustomerRepository(CustomerRepository customerRepository) {
//		System.out.println("Setter Injection");
//		this.customerRepository = customerRepository;
//	}

	@Override
	public List<Customer> findAll() {
		return customerRepository1.findAll();
	}

}
