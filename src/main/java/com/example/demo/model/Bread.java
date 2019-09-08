package com.example.demo.model;


import java.time.LocalDate;

public class Bread extends Goods {

    private LocalDate expDate;

    public Bread(String name, Double price, Double taxRate, Integer stock, LocalDate expDate) {
        super(name, price, taxRate, stock);
        this.expDate = expDate;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
}
