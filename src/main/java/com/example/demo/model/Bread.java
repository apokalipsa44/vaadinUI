package com.example.demo.model;


import javax.persistence.Entity;

@Entity
public class Bread extends Goods {

    private String expDate;

    public Bread() {
    }

    public Bread(String name, Double price, Double taxRate, Integer stock, String expDate) {
        super(name, price, taxRate, stock, GoodsType.BREAD);
        this.expDate = expDate;

    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
}
