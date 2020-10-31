package com.cg.customerapp.repository;

import com.cg.customerapp.entities.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

    private Map<Long, Customer> store = new HashMap<>();
    private long generatedId;

    Long generateId() {
        generatedId = generatedId + 1;
        return generatedId;
    }
    @Override
    public Customer add(Customer customer) {
        Long  id = generateId();
        customer.setId(id);
        store.put(id, customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        Long  id = customer.getId();
        store.put(id, customer);
        return customer;
    }


    public Customer findById(Long id) {
        return store.get(id);
    }
}
