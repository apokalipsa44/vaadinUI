package com.example.demo.UI.views;

import com.example.demo.model.Clients;
import com.example.demo.model.Products;
import com.example.demo.services.ClientsListService;
import com.example.demo.services.ProductsListService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductsView extends VerticalLayout {

    Grid<Products> grid = new Grid<>(Products.class);
    Grid<Clients>clientsGrid=new Grid<>(Clients.class);
    List<Products> productsList = new ArrayList<>();
    List<Clients> clientsList =new ArrayList<>();
    private ProductsListService productsListService;
    private ClientsListService clientsListService;

    public ProductsView(ProductsListService productsListService, ClientsListService clientsListService) {

        this.clientsListService=clientsListService;
        this.productsListService = productsListService;

        clientsList=clientsListService.createClientsList();
        productsList=productsListService.createProductsList();

        Select<String> select = new Select<>();
        select.setLabel("Select list");
        select.setItems("Products", "Clients");
        add(select);
        select.addValueChangeListener(
                event -> {
                    if(select.getValue().equals("Products")){
                        grid.setItems(productsList);
                        remove(clientsGrid);
                        add(grid);
                    }
                    else if(select.getValue().equals("Clients")){
                        clientsGrid.setItems(clientsList);
                        remove(grid);
                        add(clientsGrid);
                    }
                });
    }


}


