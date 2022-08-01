package com.example.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Repository.CustomerRepository;
import com.example.Service.CustomerService;
import com.example.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Autowired(required = true)
	private CustomerRepository customerRepository;
	
	@Override
	public Customer findByCustomerId(Long customerId) {
		Optional<Customer> response = customerRepository.findById(customerId);
		Customer customer = response.get();
		return customer;
	}
	
	

}
