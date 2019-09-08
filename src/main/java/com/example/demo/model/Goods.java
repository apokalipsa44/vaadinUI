package com.example.demo.model;



public class Goods {

    private String name;

    private Double price;

    private Double taxRate;

    private Integer stock;

    public Goods(String name, Double price, Double taxRate, Integer stock) {
        this.name = name;
        this.price = price;
        this.taxRate = taxRate;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
