package com.cg.customerapp.repository;

import com.cg.customerapp.entities.Customer;

public interface CustomerRepository {

    public Customer add(Customer customer);

    public Customer update(Customer customer);

}
