package com.cg.customerappbootjparest.Controller;

import com.cg.customerappbootjparest.entities.Customer;
import com.cg.customerappbootjparest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/customer")
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @PostMapping("/add")
    public Customer add(@RequestBody Customer customer){
        Customer customer1 = new Customer(customer.getName());
        customer = customerService.register(customer1);
        return customer;
    }

}
