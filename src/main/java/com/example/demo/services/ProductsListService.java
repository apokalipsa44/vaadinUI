package com.example.demo.services;


import com.example.demo.model.Products;
import com.example.demo.repository.services.ProductsServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsListService {

    private ProductsServiceImpl productsRepository;

    public ProductsListService(ProductsServiceImpl productsRepository) {
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

    public List<Products> createProductsList(){
        Iterable<Products>productsIterable=productsRepository.findAll();
        List<Products>productsList=new ArrayList<>();
        productsIterable.forEach(e->productsList.add(e));
      return productsList;
    }
}
