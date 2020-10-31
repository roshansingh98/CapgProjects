package com.cg.customerapp.service;

import com.cg.customerapp.entities.Customer;

public interface CustomerService {

    public Customer register(Customer customer);

    public Customer updateName(Long id, String name);

}
