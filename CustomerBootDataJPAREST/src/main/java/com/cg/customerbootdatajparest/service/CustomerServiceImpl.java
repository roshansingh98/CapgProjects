package com.cg.customerbootdatajparest.service;



import com.cg.customerbootdatajparest.entities.Customer;
import com.cg.customerbootdatajparest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


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
    public Customer findById(Long id) {
        Optional<Customer> optional = customerRepository.findById(id);
        Customer customer=optional.get();
        return customer;
    }

    @Override
    public void deleteById(Long id) {
        Customer customer = findById(id);
    }

    @Override
    public List<Customer> findByFirstName(String name) {
        List<Customer> customers=customerRepository.findByName(name);
        return customers;
    }
}
