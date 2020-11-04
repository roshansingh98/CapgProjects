package com.cg.customerbootdatajparest.service;


import com.cg.customerbootdatajparest.entities.Customer;

import java.util.List;

public interface CustomerService {

    public Customer register(Customer customer);

    public Customer update(Customer customer);

    Customer findById(Long id);

    void deleteById(Long id);

    List<Customer> findByFirstName(String name);

}
