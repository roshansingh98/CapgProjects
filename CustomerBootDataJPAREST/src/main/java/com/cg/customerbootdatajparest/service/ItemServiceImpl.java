package com.cg.customerbootdatajparest.service;

import com.cg.customerbootdatajparest.entities.Item;
import com.cg.customerbootdatajparest.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemRepository itemRepository;

    @Override
    public Item findById(Long id) {
        return null;
    }

    @Override
    public Item add(String itemName) {
        return null;
    }

    @Override
    public Item buyItem(Long itemId, Integer customerId) {
        return null;
    }

    @Override
    public Item update(Item item) {
        return null;
    }
}
