package com.cg.customerapp.service;

import com.cg.customerapp.entities.Customer;
import com.cg.customerapp.repository.CustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepositoryImpl repository;

    @Override
    public Customer register(Customer customer) {
        customer = repository.add(customer);
        return customer;
    }

    @Override
    public Customer updateName(Long id, String name) {
        Customer customer = repository.findById(id);
        customer.setName(name);
        customer = repository.update(customer);
        return customer;
    }
}
