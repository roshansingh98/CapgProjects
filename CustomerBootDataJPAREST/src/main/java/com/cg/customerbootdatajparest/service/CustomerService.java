package com.cg.customerbootdatajparest.service;


import com.cg.customerappbootjparest.entities.Customer;

public interface CustomerService {

    public Customer register(Customer customer);

    public Customer updateName(Long id, String name);

}
