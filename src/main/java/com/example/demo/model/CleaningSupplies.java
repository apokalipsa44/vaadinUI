package com.example.demo.model;


import com.example.demo.repository.goodsRepository.services.CleaningSuppliesServiceImpl;

import javax.persistence.Entity;

@Entity
public class CleaningSupplies extends Goods {

    public CleaningSupplies() {
    }

    public CleaningSupplies(String name, Double price, Double taxRate, Integer stock) {
        super(name, price, taxRate, stock, GoodsType.CLEANING_SUPPLIES);
    }
}
