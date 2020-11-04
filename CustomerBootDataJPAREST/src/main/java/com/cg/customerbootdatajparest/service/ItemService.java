package com.cg.customerbootdatajparest.service;

import com.cg.customerbootdatajparest.entities.Item;

public interface ItemService {

    Item findById(Integer id);

    Item add(String itemName , String itemDescription);

    Item buyItem(Integer itemId, Long customerId);

    Item update(Item item);
}
