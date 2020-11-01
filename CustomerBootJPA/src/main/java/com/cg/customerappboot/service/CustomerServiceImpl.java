package com.cg.customerappboot.service;


import com.cg.customerappboot.entities.Customer;
import com.cg.customerappboot.repository.CustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepositoryImpl repository;

    @Override
    @Transactional
    public Customer register(Customer customer) {
        customer = repository.add(customer);
        return customer;
    }

    @Override
    @Transactional
    public Customer updateName(Long id, String name) {
        Customer customer = repository.findById(id);
        customer.setName(name);
        customer = repository.update(customer);
        return customer;
    }
}
