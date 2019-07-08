package com.wipro.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.wipro.model.Customer;

@Repository
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		System.out.println("dbUsername = " + dbUsername);
		Customer me = new Customer("Himalaya", "Ghimire");
		customers.add(me);

		return customers;
	}
}
