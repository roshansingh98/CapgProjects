package com.cg.customerbootdatajparest.service;


import com.cg.customerbootdatajparest.entities.Customer;

import java.util.List;

public interface CustomerService {

    public Customer register(Customer customer);

    public Customer update(Customer customer);

    Customer findById(Integer id);

    void deleteById(Integer id);

    List<Customer> findByFirstName(String name);

}
