package com.example.demo.UI.views;

import com.example.demo.model.Products;
import com.example.demo.services.ProductsListService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductsView extends VerticalLayout {

    Grid<Products> grid = new Grid<>(Products.class);
    List<Products> productsList = new ArrayList<>();

    private ProductsListService productsListService;

    public ProductsView(ProductsListService productsListService) {
        Label label=new Label("products");
        this.productsListService = productsListService;
        productsList=productsListService.createProductsList();
        grid.setItems(productsList);
    }


}


