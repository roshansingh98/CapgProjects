package com.cg.customerappbootjparest.repository;


import com.cg.customerappbootjparest.entities.Customer;

public interface CustomerRepository {

    public Customer add(Customer customer);

    public Customer update(Customer customer);

}
