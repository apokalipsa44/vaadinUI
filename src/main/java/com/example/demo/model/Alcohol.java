package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class Alcohol extends Goods {

    private Double recycleFee;

    public Alcohol() {
    }

    public Alcohol(String name, Double price, Double taxRate, Integer stock, Double recycleFee) {
        super(name, price, taxRate, stock, GoodsType.ALCOHOL);
        this.recycleFee = recycleFee;
    }

    public Double getRecycleFee() {
        return recycleFee;
    }

    public void setRecycleFee(Double recycleFee) {
        this.recycleFee = recycleFee;
    }
}
