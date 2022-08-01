package com.example.Service;

import com.example.model.Customer;

public interface CustomerService {
    public Customer findByCustomerId(Long customerId);

}
