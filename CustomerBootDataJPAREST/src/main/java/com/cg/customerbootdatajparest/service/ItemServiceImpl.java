package com.cg.customerbootdatajparest.service;

import com.cg.customerbootdatajparest.entities.Customer;
import com.cg.customerbootdatajparest.entities.Item;
import com.cg.customerbootdatajparest.repository.CustomerRepository;
import com.cg.customerbootdatajparest.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Item findById(Integer id) {
        return itemRepository.findById(id).get();
    }

    @Override
    public Item add(String itemName , String itemDescription) {
        Item item = new Item(itemName , itemDescription);
        return itemRepository.save(item);
    }

    @Override
    public Item buyItem(Integer itemId, Long customerId) {
        Item item = findById(itemId);
        Customer customer = customerRepository.findById(customerId).get();
        item.setCustomer(customer);
        item = itemRepository.save(item);
        List<Item> items = customer.getItems();
        if(items==null){
            items=new ArrayList<>();
            customer.setItems(items);
        }
        items.add(item);
        return item;
    }

    @Override
    public Item update(Item item) {
        return itemRepository.save(item);
    }
}
