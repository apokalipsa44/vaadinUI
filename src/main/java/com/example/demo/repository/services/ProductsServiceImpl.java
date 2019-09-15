package com.example.demo.repository.services;

import com.example.demo.model.Products;
import com.example.demo.repository.ProductsRepository;

import org.springframework.stereotype.Service;

@Service
public class ProductsServiceImpl {
    private ProductsRepository productsRepository;

    public ProductsServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public Iterable<Products> findAll(){
        return productsRepository.findAll();
    }

    public Products save(Products product){
        return  productsRepository.save(product);
    }
}
