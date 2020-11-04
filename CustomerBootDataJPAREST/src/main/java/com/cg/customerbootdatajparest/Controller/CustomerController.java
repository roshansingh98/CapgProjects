package com.cg.customerbootdatajparest.Controller;


import com.cg.customerbootdatajparest.dto.CustomerDetails;
import com.cg.customerbootdatajparest.entities.Customer;
import com.cg.customerbootdatajparest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Validated
@RequestMapping("/customer")
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public CustomerDetails add(@RequestBody Customer customer){
        Customer customer1 = new Customer(customer.getName());
        customer = customerService.register(customer1);
        CustomerDetails customerDetails = new CustomerDetails(customer);
        return customerDetails;
    }

}
