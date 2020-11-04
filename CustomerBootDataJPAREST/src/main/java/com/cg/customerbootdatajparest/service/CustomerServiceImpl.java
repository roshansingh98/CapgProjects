package com.cg.customerbootdatajparest.service;



import com.cg.customerbootdatajparest.entities.Customer;
import com.cg.customerbootdatajparest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer register(Customer customer) {
        customer = customerRepository.save(customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        customer = customerRepository.save(customer);
        return customer;
    }

    @Override
    public Customer findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<Customer> findByFirstName(String name) {
        return null;
    }
}
