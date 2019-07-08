package com.wipro.repository;

import java.util.List;

import com.wipro.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}