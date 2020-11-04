package com.cg.customerbootdatajparest.dto;

import com.cg.customerbootdatajparest.entities.Customer;
import com.cg.customerbootdatajparest.entities.Item;

import java.util.List;

public class CustomerDetails {

    private Long id;
    private String name;
    private List<Item> items;

    public CustomerDetails() {};

    public CustomerDetails(Customer customer){
        this.id = customer.getId();
        this.name = customer.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
