package com.cg.customerapp.UI;

import com.cg.customerapp.entities.Customer;
import com.cg.customerapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UIMain {

    @Autowired
    private CustomerService customerService;

    public void runApp(){

        Customer customer = add("Rahul");
        Customer customer1 = add("Saha");
        Customer customer2= add("Rohit");

        System.out.println("For id: " + customer1.getId() + " current name is : " + customer1.getName());

        System.out.println("-----------------Now updating for the same person----------------");
        update(customer1.getId(), "John");
        System.out.println("After updating");
        System.out.println("For id: " + customer1.getId() + " name changed to : " + customer1.getName());

    }

    public Customer add(String name)
    {
        Customer customer = new Customer(name);
        customer = customerService.register(customer);
        return customer;
    }

    public Customer update(Long id, String newName)
    {
        return customerService.updateName(id, newName);
    }

}
