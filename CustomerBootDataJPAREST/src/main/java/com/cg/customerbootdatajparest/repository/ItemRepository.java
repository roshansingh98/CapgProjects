package com.cg.customerbootdatajparest.repository;

import com.cg.customerbootdatajparest.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item , Integer> {
}
