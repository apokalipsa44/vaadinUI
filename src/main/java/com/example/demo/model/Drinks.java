package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Drinks extends Goods{

    @Temporal(TemporalType.DATE)
    private Date expDate;

    public Drinks() {
    }

    public Drinks(String name, Double price, Double taxRate, Integer stock, Date expDate) {
        super(name, price, taxRate, stock, GoodsType.DRINKS);
        this.expDate = expDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
}
