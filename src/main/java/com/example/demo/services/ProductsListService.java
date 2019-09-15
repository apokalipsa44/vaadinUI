package com.example.demo.services;


import com.example.demo.model.Products;
import com.example.demo.repository.services.ProductsServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductsList {

    private ProductsServiceImpl productsRepository;

    public ProductsList(ProductsServiceImpl productsRepository) {
        this.productsRepository = productsRepository;

        Products product1=new Products("masło", true, "masła" );
        Products product2=new Products("soap", true ,"cleaning");
        Products product3= new Products("monka", true, "baking");
        Products product4= new Products("chlebek", false, "baking");

        productsRepository.save(product1);
        productsRepository.save(product2);
        productsRepository.save(product3);
        productsRepository.save(product4);
    }

}
