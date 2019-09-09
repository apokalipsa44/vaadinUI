package com.example.demo.UI.views;

import com.example.demo.model.Bread;
import com.example.demo.model.CleaningSupplies;
import com.example.demo.model.Goods;
import com.example.demo.repository.goodsRepository.GoodsRepo;
import com.example.demo.repository.goodsRepository.services.BreadServiceImpl;
import com.example.demo.repository.goodsRepository.services.GoodsServiceImpl;
import com.example.demo.services.GoodsListService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductsView extends VerticalLayout {



    Grid<Goods> goodsGrid = new Grid<>(Goods.class);

    GoodsListService goodsListService;

    public ProductsView(GoodsListService goodsListService) {
        this.goodsListService=goodsListService;

        Select<String> select = new Select<>();
        select.setLabel("Select products");
        select.setItems("Bread", "Alcohol", "Drinks", "Cleaning supplies", "Frozen food", "Meat", "Milk products",
                "Sweets", "Tabacco", "Other products");


        select.addValueChangeListener(
                event -> {
                    if (event.getValue().equals("Bread"))
                        goodsGrid.setItems(goodsListService.listInitBread());
                    if (event.getValue().equals("Cleaning supplies"))
                        goodsGrid.setItems(goodsListService.listInitCleaningSup());

                });


        add(select, goodsGrid);
    }


}


