package com.adlo.springdemo.service;

import java.util.List;

import com.adlo.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
