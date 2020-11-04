package com.cg.customerbootdatajparest.service;

import com.cg.customerbootdatajparest.entities.Item;

public interface ItemService {

    Item findById(Long id);

    Item add(String itemName);

    Item buyItem(Long itemId, Integer customerId);

    Item update(Item item);
}
