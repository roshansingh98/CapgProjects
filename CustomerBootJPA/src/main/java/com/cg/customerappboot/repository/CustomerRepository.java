package com.cg.customerappboot.repository;


import com.cg.customerappboot.entities.Customer;

public interface CustomerRepository {

    public Customer add(Customer customer);

    public Customer update(Customer customer);

}
