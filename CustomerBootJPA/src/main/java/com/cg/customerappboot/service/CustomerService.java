package com.cg.customerappboot.service;


import com.cg.customerappboot.entities.Customer;

public interface CustomerService {

    public Customer register(Customer customer);

    public Customer updateName(Long id, String name);

}
