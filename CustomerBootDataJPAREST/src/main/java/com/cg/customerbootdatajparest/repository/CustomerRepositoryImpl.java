package com.cg.customerbootdatajparest.repository;



import com.cg.customerappbootjparest.entities.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Customer add(Customer customer) {
        entityManager.persist(customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        return entityManager.merge(customer);
    }

    public Customer findById(Long id) {
        return entityManager.find(Customer.class, id);
    }
}
